package characters;

import java.util.ArrayList;
import java.util.List;

/**
 * プレイヤーと仲間　合計３人を持つパーティ
 * @author ilearning
 *
 */
public class Party {
	private List<Human> humanArray;
	private Human human;				// インスタンスを持つコレクション
	private final int MAXCOUNT = 3;			// 保持できる最大数
	private String partyName;					// パーティ名
	private int result = 0;					// バトル結果

	public Party() {							// コンストラクタ
		humanArray = new ArrayList<Human>();
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
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

	// メンバー個別情報を渡す（0～2　位置を指定）
	public Human getMember() {
		return human;
	}

	// メンバー全員のHPMPを全回復
	public void recoverAll() {
			// 現在hpに最大hpをセット
			human.setHp(human.getMaxHp());
			// 現在moに最大mpをセット
			human.setMp(human.getMaxMp());
	}

	// メンバーの生死判定　全員戦闘不能ならtrueを返す
	public boolean isAllDead() {
		// 初期値はfalse：全員戦闘不能　をセット
		boolean isAllDead = true;
		// 一人でもｈｐがあればfalse：違う　をセット
			if (human.getHp() > 0) {
				isAllDead = false;
			}
		return isAllDead;
	}

	public String getAllMemberInfo() {
		String res = "\n";
			res = res + human.toString() + "\n";
		return res;
	}

	public int count() {
		return 1;
	}



}
