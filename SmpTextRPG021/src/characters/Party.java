package characters;

import java.util.ArrayList;
import java.util.List;

/**
 * プレイヤーと仲間　合計３人を持つパーティ
 * @author ilearning
 *
 */
public class Party {

	private List<Human> humanArray;				// インスタンスを持つコレクション
	private final int MAXCOUNT = 3;			// 保持できる最大数
	private String partyName;					// パーティ名
	private int result = 0;					// バトル結果

	public Party() {							// コンストラクタ
		humanArray = new ArrayList<>();
	}

	public void setName(String name) {
		this.partyName = name;
	}
	public String getName() {
		return this.partyName;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getResult() {
		return this.result;
	}

	// メンバーの追加
	public boolean addMember(Human member) {
		if (humanArray.size() < MAXCOUNT) {
			humanArray.add(member);
			return true;
		} else {
			return false;
		}
	}

	// メンバーの削除　定義なし

	// メンバー個別情報を渡す（0～2　位置を指定）
	public Human getMember(int i) {
		return humanArray.get(i);
	}

	// メンバー全員のHPMPを全回復
	public void recoverAll() {
		for (int i = 0; i < humanArray.size(); i++) {
			// Listからhuman型インスタンスを取得
			Human human = humanArray.get(i);
			// 現在hpに最大hpをセット
			human.setHp(human.getMaxHp());
			// 現在moに最大mpをセット
			human.setMp(human.getMaxMp());
			// Listに戻す
			humanArray.set(i, human);
		}
	}

	// メンバーの生死判定　全員戦闘不能ならtrueを返す
	public boolean isAllDead() {
		// 初期値はfalse：全員戦闘不能　をセット
		boolean isAllDead = true;
		// 一人でもｈｐがあればfalse：違う　をセット
		for( Human member : humanArray) {
			if (member.getHp() > 0) {
				isAllDead = false;
			}
		}
		return isAllDead;
	}

	// 全員の簡易情報を返す
	public String getAllMemberInfo() {
		String res = "\n";
		for (Human human: humanArray) {
			res = res + human.getNowInfo() + "\n";
		}
		return res;
	}
	// 全員の詳細情報を返す
	public String getAllMemberDetailsInfo() {
		String res = "\n";
		for (Human human: humanArray) {
			res = res + human.getDetailsInfo() + "\n";
		}
		return res;
	}


}
