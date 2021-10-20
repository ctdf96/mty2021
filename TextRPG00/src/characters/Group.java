package characters;

import java.util.ArrayList;
import java.util.List;

/**
 * モンスター３匹を持った１グループとして使用
 * @author ilearning
 *
 */
public class Group {

	private List<Monster> monsterArray;				// インスタンスを持つ
	private final int MAXCOUNT = 3;			// 保持できる最大数

	public Group() {							// コンストラクタ
		monsterArray = new ArrayList<>();
	}

	// メンバーの追加
	public boolean addMember(Monster monster) {
		if (monsterArray.size() < MAXCOUNT) {
			monsterArray.add(monster);
			return true;
		} else {
			return false;
		}
	}
	// メンバーの削除　定義なし

	// メンバー個別情報を渡す（0～2　位置を指定）
	public Monster getMember(int i) {
		return monsterArray.get(i);
	}

	// メンバーの生死判定　全員戦闘不能ならtrueを返す
	public boolean isAllDead() {
		// 初期値はfalse：全員戦闘不能　をセット
		boolean result = true;
		// 一人でもｈｐがあればfalse：違う　をセット
		for( Monster monster : monsterArray) {
			if (monster.getHp() > 0) {
				result = false;
			}
		}
		return result;
	}



	public int count() {
		return monsterArray.size();

	}


}
