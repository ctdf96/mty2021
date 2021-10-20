package characters;

/**
 * モンスター名：キメラ　インスタンス生成用
 * @author ilearning
 *
 */
public class Chimera extends Monster{

	private static final int CHIMERAS_HP = 20;				// ＨＰ
	private static final int CHIMERAS_MP = 30;				// 最大ＭＰ
	private static final int CHIMERAS_DEFENSE = 10;			// 守備力
	private static final int CHIMERAS_OFFENSE = 15;			// 攻撃力

	public Chimera() {
		super(CHIMERAS_HP, CHIMERAS_MP, CHIMERAS_DEFENSE, CHIMERAS_OFFENSE);
		setName(this.getClass().getSimpleName());
	}


}
