package characters;

/**
 * メンバー職業名：ナイト　インスタンス生成用
 * @author ilearning
 *
 */
public class Knight extends Human {

	private static final int KNIGHTS_MAX_HP = 83;				// 最大ＨＰ
	private static final int KNIGHTS_MAX_MP = 10;				// 最大ＭＰ
	private static final int KNIGHTS_DEFENSE = 30;			// 守備力
	private static final int KNIGHTS_OFFENSE = 35;			// 攻撃力

	public Knight() {
		super(KNIGHTS_MAX_HP, KNIGHTS_MAX_MP, KNIGHTS_DEFENSE, KNIGHTS_OFFENSE);
	}

	/**
	 * キャラクタの現在情報を返す
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + getName() + " hp:" + getHp() + " mp:" + getMp() ;
	}


}
