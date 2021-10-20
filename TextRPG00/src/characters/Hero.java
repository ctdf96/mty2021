package characters;

/**
 * メンバー職業名：ヒーロー　インスタンス生成用
 * @author ilearning
 *
 */
public class Hero extends Human {

	private static final int HEROS_MAX_HP = 72;				// 最大ＨＰ
	private static final int HEROS_MAX_MP = 20;				// 最大ＭＰ
	private static final int HEROS_DEFENSE = 20;				// 守備力
	private static final int HEROS_OFFENSE = 30;				// 攻撃力

	public Hero() {
		super(HEROS_MAX_HP, HEROS_MAX_MP, HEROS_DEFENSE, HEROS_OFFENSE);
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
