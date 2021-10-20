package characters;

/**
 * メンバー職業名：ヒーラー（回復者）　インスタンス生成用
 * @author ilearning
 *
 */
public class Healer extends Human {

	private static final int HEALERS_MAX_HP = 41;			// 最大ＨＰ
	private static final int HEALERS_MAX_MP = 50;			// 最大ＭＰ
	private static final int HEALERS_DEFENSE = 10;			// 守備力
	private static final int HEALERS_OFFENSE = 3;			// 攻撃力

	public Healer() {
		super(HEALERS_MAX_HP, HEALERS_MAX_MP, HEALERS_DEFENSE, HEALERS_OFFENSE);
	}


	/**
	 * キャラクタの現在情報を返す
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + getName() + " hp:" + getHp() + " mp:" + getMp() +
				" 回復魔法";
	}

}
