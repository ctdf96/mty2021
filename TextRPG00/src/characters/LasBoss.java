package characters;

/**
 * モンスター名：ラスボス　インスタンス生成用
 * @author ilearning
 *
 */
public class LasBoss extends Monster{

	private static final int LASBOSSS_HP = 1000;				// ＨＰ
	private static final int LASBOSSS_MP = 500;				// 最大ＭＰ
	private static final int LASBOSSS_DEFENSE = 4;				// 守備力
	private static final int LASBOSSS_OFFENSE = 50;			// 攻撃力

	public LasBoss() {
		super(LASBOSSS_HP, LASBOSSS_MP, LASBOSSS_DEFENSE, LASBOSSS_OFFENSE);
		setName(this.getClass().getSimpleName());
	}


}
