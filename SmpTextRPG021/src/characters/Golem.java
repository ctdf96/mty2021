package characters;

import Interface.CommandSelecter;
import library.CommandSelecterA;

/**
 * モンスター名：ゴーレム　インスタンス生成用
 * @author ilearning
 *
 */
public class Golem extends Monster{

	private static final int GOLEMS_MAX_HP = 80;							// ＨＰ
	private static final int GOLEMS_MAX_MP = 10;							// 最大ＭＰ
	private static final int GOLEMS_DEFENSE = 20;						// 守備力
	private static final int GOLEMS_OFFENSE = 35;						// 攻撃力

	// ②
	// 021 private static final boolean GOLEMS_CAN_MAGIC_ATTACK = false;	// ②魔法攻撃
	// 021 private static final boolean GOLEMS_CAN_HEALING = false;			// ②回復魔法
	private static final int GOLEMS_MAGIC_COEFFICIENT = 0;				// ②魔法係数
	private static final int FIGHTERS_MAGIC_COST = 0;					// ②消費MP
	private static final int ATTACK_RATE = 85;							// 021攻撃率

	private CommandSelecter command;										// 021

	public Golem() {
		super(GOLEMS_MAX_HP, GOLEMS_MAX_MP, GOLEMS_DEFENSE, GOLEMS_OFFENSE,
				// 021 GOLEMS_CAN_MAGIC_ATTACK, GOLEMS_CAN_HEALING,			// ②
				GOLEMS_MAGIC_COEFFICIENT, FIGHTERS_MAGIC_COST			// ②
				);
		setName(this.getClass().getSimpleName());
		this.command = new CommandSelecterA();								// 021
	}
	// 021 このメソッドはCharacterクラスから継承
	@Override
	public int getNextCommand() {
		return command.selectCommand(ATTACK_RATE);
	}

}
