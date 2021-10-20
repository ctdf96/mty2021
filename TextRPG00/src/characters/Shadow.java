package characters;

/**
 * モンスター名：シャドウ　インスタンス生成用
 * @author ilearning
 *
 */
public class Shadow extends Monster{

	private static final int SHADOWS_HP = 120;				// ＨＰ
	private static final int SHADOWS_MP = 60;				// 最大ＭＰ
	private static final int SHADOWS_DEFENSE = 34;			// 守備力
	private static final int SHADOWS_OFFENSE = 45;			// 攻撃力

	public Shadow() {
		super(SHADOWS_HP, SHADOWS_MP, SHADOWS_DEFENSE, SHADOWS_OFFENSE);
		setName(this.getClass().getSimpleName());
	}


}
