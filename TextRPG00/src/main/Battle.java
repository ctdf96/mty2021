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
		// shadow:8 → 10%  devil:3%  LasBoss:1%
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
		// 4秒wait
		SmpTextRPG01.wait(4);

		// どちらかが全滅するまでループ
BTLLOOP:
		while(true) {
			// １ターン処理

			// パーティ側のコマンド決定
				Human human = party.getHuman();
				// random関数　0-9 偶数なら守備
				if ((rand.nextInt(10)%2) == 0) {
					human.setNextCommand(Constant.COMMAND_DEFENSE);
				} else {
					human.setNextCommand(Constant.COMMAND_ATTACK);
				}

			// モンスター側のコマンド決定
			for (int i = 0; i < 3; i++) {
				Monster monster = group.getMember(i);
				// random関数　0-9 偶数なら守備
				if ((rand.nextInt(10)%2) == 0) {
					monster.setNextCommand(Constant.COMMAND_DEFENSE);
				} else {
					monster.setNextCommand(Constant.COMMAND_ATTACK);
				}
			}

			// パーティ側の攻撃
			// 毎回モンスター側の全滅チェック　全滅していればwin & break
				// ㏋が0のパーティは攻撃できない
				if (party.getHuman().getHp() == 0) {
					System.out.println(party.getHuman().getName() + "は戦闘不能だ");
					// 1秒wait
					SmpTextRPG01.wait(1);

					continue;
				}
				// 対象のインデックス決定
				int opponentIndex = rand.nextInt(3);
				// 戦闘不能モンスターは対象外に
				for (int ii = 0; ii < 3; ii++) {
					if (group.getMember(opponentIndex).getHp() == 0) {
						opponentIndex = (opponentIndex + 1) % 3;
					} else {
						break;
					}
				}
				Monster opponent = group.getMember(opponentIndex);
				int damage = 0;
				System.out.println(human.getName() + "の攻撃");
				// 2秒wait
				SmpTextRPG01.wait(2);

				if (human.getNextCommand() == Constant.COMMAND_ATTACK) {
					if (opponent.getNextCommand() == Constant.COMMAND_ATTACK) {
						damage = human.getOffense();
					} else if (opponent.getNextCommand() == Constant.COMMAND_DEFENSE) {
						damage = human.getOffense() - opponent.getDefense();
						if (damage < 0) {
							damage = 0;
						}
					}
					opponent.setHp(opponent.getHp() - damage);
					System.out.println(opponent.getName() + "は " + damage + "のダメージ");
					// 2秒wait
					SmpTextRPG01.wait(2);
				} else if (human.getNextCommand() == Constant.COMMAND_DEFENSE) {
					// なにもしない
					System.out.println(human.getName() + "は身を守っている");
					// 2秒wait
					SmpTextRPG01.wait(2);
				}
				// 対象モンスター戦闘不能か
				if (opponent.getHp() <= 0) {
					opponent.setHp(0);
					System.out.println(opponent.getName() + "を倒した");
					// 2秒wait
					SmpTextRPG01.wait(2);
				}
				// モンスターは全滅したか
				if (group.isAllDead()) {
					// 勝利フラグ　セット
					party.setResult(Constant.BATTLE_WIN);
					// バトルの永久ループを抜ける
					break BTLLOOP;
				}

			// モンスター側の攻撃
			// 毎回パーティ側の全滅チェック　全滅していればlose break
			for (int i = 0; i < 3; i++) {
				// ㏋が0のモンスターは攻撃できない
				if (group.getMember(i).getHp() == 0) {
					System.out.println(group.getMember(i).getName() + "は戦闘不能だ");
					// 1秒wait
					SmpTextRPG01.wait(1);
					continue;
				}
				Monster monster = group.getMember(i);
				damage = 0;
				System.out.println(monster.getName() + "の攻撃");
				// 2秒wait
				SmpTextRPG01.wait(2);
				if (monster.getNextCommand() == Constant.COMMAND_ATTACK) {
					if (human.getNextCommand() == Constant.COMMAND_ATTACK) {
						damage = monster.getOffense();
					} else if (human.getNextCommand() == Constant.COMMAND_DEFENSE) {
						damage = monster.getOffense() - human.getDefense();
						if (damage < 0) {
							damage = 0;
						}
					}
					human.setHp(human.getHp() - damage);
					System.out.println(human.getName() + "は " + damage + "のダメージ");
				} else if (monster.getNextCommand() == Constant.COMMAND_DEFENSE) {
					// なにもしない
					System.out.println(monster.getName() + "は身を守っている");
				}
				// 2秒wait
				SmpTextRPG01.wait(2);

				// 対象パーティメンバー戦闘不能か
				if (human.getHp() <= 0) {
					human.setHp(0);
					System.out.println(human.getName() + "は倒れた");
					// 2秒wait
					SmpTextRPG01.wait(2);
				}
				// パーティは全滅したか
				if (party.isAllDead()) {
					// 勝利フラグ　セット
					party.setResult(Constant.BATTLE_LOSE);
					// バトルの永久ループを抜ける
					break BTLLOOP;
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
