package characters;

/**
 * メンバー職業名：メイジ　インスタンス生成用
 * @author ilearning
 *
 */
public class Mage extends Human {

	private static final int MAGES_MAX_HP = 55;				// 最大ＨＰ
	private static final int MAGES_MAX_MP = 50;				// 最大ＭＰ
	private static final int MAGES_DEFENSE = 10;				// 守備力
	private static final int MAGES_OFFENSE = 5;				// 攻撃力

	public Mage() {
		super(MAGES_MAX_HP, MAGES_MAX_MP, MAGES_DEFENSE, MAGES_OFFENSE);
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
