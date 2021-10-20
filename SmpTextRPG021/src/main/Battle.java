package main;

import java.util.Random;

import characters.Chimera;
import characters.Devil;
import characters.Golem;
import characters.Group;
import characters.Human;
import characters.LasBoss;
import characters.Monster;
import characters.Party;
import characters.Shadow;
import characters.Slime;
import library.Constant;

/**
 * バトル：戦闘の処理をここで行う
 * @author ilearning
 *
 */
public class Battle {

	public Party battle(Party party) {

		Random rand = new Random();

		// モンスターとそのグループ作成
		Group group = new Group();

		// レアモンスター出現判定
		// shadow:8%  devil:3%  LasBoss:1%
		Monster[] isAppear = new Monster[3];
		// shadow
		if ((rand.nextInt(100)%10) == 0) {
			isAppear[0] = new Shadow();
		}
		// devil
		if ((rand.nextInt(100)%33) == 0) {
			isAppear[1] = new Devil();
		}
		// LasBoss
		if ((rand.nextInt(100)%99) == 0) {
			isAppear[2] = new LasBoss();
		}
		// モンスターをランダム生成、グループにセット
		for (int i = 0; i < 3; i++) {
			Monster monster = null;
			if (isAppear[i] == null) {
				monster = selectMonster();
			} else {
				monster = isAppear[i];
			}
			group.addMember(monster);
		}

		// モンスター名表示
		System.out.print(group.getMember(0).getName() + ", ");
		System.out.print(group.getMember(1).getName() + ", ");
		System.out.println(group.getMember(2).getName() + " だ！");
		System.out.println("");
		// 2秒wait
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		// どちらかが全滅するまでループ
BTLLOOP:
		while(true) {
			// １ターン処理

			// パーティ側のコマンド決定
			// 021 コマンドは都度、humanから受け取る
/*
			for (int i = 0; i < 3; i++) {
				Human human = party.getMember(i);
				// random関数　0-9 3の倍数なら守備
				if ((rand.nextInt(10)%3) == 0) {
					human.setNextCommand(Constant.COMMAND_DEFENSE);
				} else {
					// 3の倍数ではないなら攻撃　
					// ②ただし再度ランダム数取得、魔法は1/3の確率
					int prayMagic = rand.nextInt(10) % 3;
					if (human.getCanMagicAttack() && (prayMagic == 0)) {
						human.setNextCommand(Constant.COMMAND_MAGIC);
					} else if (human.getCanHealing() && (prayMagic == 0)) {
						human.setNextCommand(Constant.COMMAND_HEAL);
					} else {
					human.setNextCommand(Constant.COMMAND_ATTACK);
					}
				}
			}
*/
			// モンスター側のコマンド決定
			// 021 コマンドは都度、Monsterから受け取る
/*
			for (int i = 0; i < 3; i++) {
				Monster monster = group.getMember(i);
				// random関数　0-9 3の倍数なら守備
				if ((rand.nextInt(10)%3) == 0) {
					monster.setNextCommand(Constant.COMMAND_DEFENSE);
				} else {
					// 奇数なら攻撃　②ただし再度ランダム数取得、4の倍数なら魔法
					int prayMagic = rand.nextInt(10) % 4;
					if (monster.getCanMagicAttack() && (prayMagic == 0)) {
						monster.setNextCommand(Constant.COMMAND_MAGIC);
					} else if (monster.getCanHealing() && (prayMagic == 0)) {
						monster.setNextCommand(Constant.COMMAND_HEAL);
					} else {
						monster.setNextCommand(Constant.COMMAND_ATTACK);
					}
				}
			}
*/
			// パーティ側の攻撃
			// 毎回モンスター側の全滅チェック　全滅していればwin & break
			for (int i = 0; i < 3; i++) {
				// ㏋が0のパーティメンバーは攻撃できない
				if (party.getMember(i).getHp() == 0) {
					System.out.println(party.getMember(i).getName() + "は戦闘不能だ");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
					continue;
				}
				// 対象のインデックス決定
				int opponentIndex = rand.nextInt(3);
				// 対象が戦闘不能なら除外
				for (int ii = 0; ii < 3; ii++) {
					if (group.getMember(opponentIndex).getHp() == 0) {
						opponentIndex = (opponentIndex + 1) % 3;
					} else {
						break;
					}
				}

				Monster opponent = group.getMember(opponentIndex);
				Human attacker = party.getMember(i);

				// 021 両者のコマンド取得
				int attCommand = attacker.getNextCommand();
				int oppCommand = opponent.getNextCommand();

				System.out.println(attacker.getName() + "の攻撃");
				// 回復か攻撃か
				// 回復
				if (attCommand == Constant.COMMAND_HEAL) {				// 回復
					System.out.println(attacker.getName() + "は回復魔法を使った");
					if (attacker.getMp() >= attacker.getMagicCost()) {
						// 回復するｈｐ量を算出
						int plusHp = attacker.getMagicCoefficient() * attacker.getMagicCost();
						// 消費MP分　減算
						attacker.setMp(attacker.getMp() - attacker.getMagicCost());
						// 回復対象を決定
						int index = rand.nextInt(3);
						int newHp = party.getMember(index).getHp() + plusHp;
						if (newHp > party.getMember(index).getMaxHp()) {
							newHp = party.getMember(index).getMaxHp();
						}
						party.getMember(index).setHp(newHp);
						System.out.println(party.getMember(index).getName() + "は" + plusHp + "回復した");
						System.out.println(party.getMember(index).getNowInfo());
					} else {
						System.out.println(attacker.getName() + "のMPが足りない！");
					}
				} else if (attCommand == Constant.COMMAND_DEFENSE) {	// 守備
						System.out.println(attacker.getName() + "は身を守っている");
				} else {
					// 攻撃
					// 与えるダメージを決定する　攻撃系
					int damage = 0;
					int defend = 0;
					if (attCommand == Constant.COMMAND_ATTACK) {
						damage = attacker.getOffense();
					} else
					if (attCommand == Constant.COMMAND_MAGIC) {		// ②魔法攻撃
						System.out.println(attacker.getName() + "は魔法を使った");
						if (attacker.getMp() >= attacker.getMagicCost()) {
							damage = attacker.getMagicCoefficient() * attacker.getMagicCost();
							// 消費mp分　減算
							attacker.setMp(attacker.getMp() - attacker.getMagicCost());
						} else {
							System.out.println(attacker.getName() + "のMPが足りない！");
							damage = 0;
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
					}
					// 敵の守備
					if (oppCommand == Constant.COMMAND_DEFENSE) {
						defend = opponent.getDefense();
						System.out.println(opponent.getName() + "は身を守っている");
					}
					damage = damage - defend;
					if (damage < 0) {
						damage = 0;
					}
					System.out.println(opponent.getName() + "は" + damage + "のダメージ");
					opponent.setHp(opponent.getHp() - damage);
				}

				// 対象モンスター戦闘不能か
				if (opponent.getHp() <= 0) {
					opponent.setHp(0);
					System.out.println(opponent.getName() + "を倒した");
				}
				// モンスターは全滅したか
				if (group.isAllDead()) {
					// 勝利フラグ　セット
					party.setResult(Constant.BATTLE_WIN);
					// バトルの永久ループを抜ける
					break BTLLOOP;
				}
				// 2秒wait
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}

			// モンスター側の攻撃
			// 毎回パーティ側の全滅チェック　全滅していればlose break
			for (int i = 0; i < 3; i++) {
				// ㏋が0のモンスターは攻撃できない
				if (group.getMember(i).getHp() == 0) {
					System.out.println(group.getMember(i).getName() + "は戦闘不能だ");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
					continue;
				}
				// 対象のインデックス決定
				int opponentIndex = rand.nextInt(3);
				// 戦闘不能パーティメンバーは攻撃対象外に
				for (int ii = 0; ii < 3; ii++) {
					if (party.getMember(opponentIndex).getHp() == 0) {
						opponentIndex = (opponentIndex + 1) % 3;
					} else {
						break;
					}
				}
				Human opponent = party.getMember(opponentIndex);
				Monster attacker = group.getMember(i);

				// 021 両者のコマンド取得
				int attCommand = attacker.getNextCommand();
				int oppCommand = opponent.getNextCommand();


				System.out.println(attacker.getName() + "の攻撃");
				// 回復か攻撃か
				// 回復
				if (attCommand == Constant.COMMAND_HEAL) {				// 回復
					System.out.println(attacker.getName() + "は回復魔法を使った");
					if (attacker.getMp() >= attacker.getMagicCost()) {
						// 回復するｈｐ量を算出
						int plusHp = attacker.getMagicCoefficient() * attacker.getMagicCost();
						// 消費MP分　減算
						attacker.setMp(attacker.getMp() - attacker.getMagicCost());
						// 回復対象を決定
						int index = rand.nextInt(3);
						int newHp = group.getMember(index).getHp() + plusHp;
						if (newHp > group.getMember(index).getMaxHp()) {
							newHp = group.getMember(index).getMaxHp();
						}
						group.getMember(index).setHp(newHp);
						System.out.println(group.getMember(index).getName() + "は" + plusHp + "回復した");
						System.out.println(group.getMember(index).getNowInfo());
					} else {
						System.out.println(attacker.getName() + "のMPが足りない！");
					}
				} else if (attCommand == Constant.COMMAND_DEFENSE) {	// 守備
						System.out.println(attacker.getName() + "は身を守っている");
				} else {
					// 攻撃
					// 与えるダメージを決定する　攻撃系
					int damage = 0;
					int defend = 0;
					if (attCommand == Constant.COMMAND_ATTACK) {
						damage = attacker.getOffense();
					} else
					if (attCommand == Constant.COMMAND_MAGIC) {		// ②魔法攻撃
						System.out.println(attacker.getName() + "は魔法を使った");
						if (attacker.getMp() >= attacker.getMagicCost()) {
							damage = attacker.getMagicCoefficient() * attacker.getMagicCost();
							// 消費mp分　減算
							attacker.setMp(attacker.getMp() - attacker.getMagicCost());
						} else {
							System.out.println(attacker.getName() + "のMPが足りない！");
							damage = 0;
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
					}
					// 敵の守備
					if (oppCommand == Constant.COMMAND_DEFENSE) {
						defend = opponent.getDefense();
						System.out.println(opponent.getName() + "は身を守っている");
					}
					damage = damage - defend;
					if (damage < 0) {
						damage = 0;
					}
					System.out.println(opponent.getName() + "は" + damage + "のダメージ");
					opponent.setHp(opponent.getHp() - damage);
				}

				// 対象パーティメンバー戦闘不能か
				if (opponent.getHp() <= 0) {
					opponent.setHp(0);
					System.out.println(opponent.getName() + "は倒れた");

				}
				// パーティは全滅したか
				if (party.isAllDead()) {
					// 敗北フラグ　セット
					party.setResult(Constant.BATTLE_LOSE);
					// バトルの永久ループを抜ける
					break BTLLOOP;
				}
				// 2秒wait
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}

			// １ターン終了
			// パーティ全員の情報
			System.out.println(party.getAllMemberInfo());
			// 2秒wait
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}

		// バトル終了
		return party;
	}

	/**
	 * ランダムに３種類のモンスターから1匹を返す
	 * @return
	 */
	private Monster selectMonster() {
		Random rand = new Random();
		Monster monster = null;
		int monsterId = rand.nextInt(3);
		switch(monsterId) {
		case 0:
			monster = new Slime();
			break;
		case 1:
			monster = new Chimera();
			break;
		case 2:
			monster = new Golem();
			break;
		default:
			monster = new Slime();
			break;
		}
		return monster;
	}

}
