package characters;

/**
 * モンスター名：ゴーレム　インスタンス生成用
 * @author ilearning
 *
 */
public class Golem extends Monster{

	private static final int GOLEMS_HP = 80;					// ＨＰ
	private static final int GOLEMS_MP = 10;					// 最大ＭＰ
	private static final int GOLEMS_DEFENSE = 20;			// 守備力
	private static final int GOLEMS_OFFENSE = 35;			// 攻撃力

	public Golem() {
		super(GOLEMS_HP, GOLEMS_MP, GOLEMS_DEFENSE, GOLEMS_OFFENSE);
		setName(this.getClass().getSimpleName());
	}

}
