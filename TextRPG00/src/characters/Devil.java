package characters;

/**
 * モンスター名：デビル　インスタンス生成用
 * @author ilearning
 *
 */
public class Devil extends Monster{

	private static final int DEVILS_HP = 300;				// ＨＰ
	private static final int DEVILS_MP = 100;				// 最大ＭＰ
	private static final int DEVILS_DEFENSE = 35;			// 守備力
	private static final int DEVILS_OFFENSE = 40;			// 攻撃力

	public Devil() {
		super(DEVILS_HP, DEVILS_MP, DEVILS_DEFENSE, DEVILS_OFFENSE);
		setName(this.getClass().getSimpleName());
	}


}
