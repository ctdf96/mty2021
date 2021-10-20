package characters;

/**
 * モンスター名：スライム　インスタンス生成用
 * @author ilearning
 *
 */
public class Slime extends Monster{

	private static final int SLIMES_HP = 15;					// ＨＰ
	private static final int SLIMES_MP = 0;					// 最大ＭＰ
	private static final int SLIMES_DEFENSE = 5;				// 守備力
	private static final int SLIMES_OFFENSE = 9;				// 攻撃力

	public Slime() {
		super(SLIMES_HP, SLIMES_MP, SLIMES_DEFENSE, SLIMES_OFFENSE);
		setName(this.getClass().getSimpleName());
	}

}
