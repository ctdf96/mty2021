package characters;

/**
 * メンバー職業名：ファイター　インスタンス生成用
 * @author ilearning
 *
 */
public class Fighter extends Human {

	private static final int FIGHTERS_MAX_HP = 108;			// 最大ＨＰ
	private static final int FIGHTERS_MAX_MP = 0;			// 最大ＭＰ
	private static final int FIGHTERS_DEFENSE = 10;			// 守備力
	private static final int FIGHTERS_OFFENSE = 42;			// 攻撃力

	public Fighter() {
		super(FIGHTERS_MAX_HP, FIGHTERS_MAX_MP, FIGHTERS_DEFENSE, FIGHTERS_OFFENSE);
	}


	/**
	 * キャラクタの現在情報を返す
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + getName() + " hp:" + getHp() + " mp:" + getMp() +
				" 魔法攻撃";
	}

}
