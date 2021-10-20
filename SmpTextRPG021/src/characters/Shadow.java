package characters;

import Interface.CommandSelecter;
import library.CommandSelecterB;

/**
 * モンスター名：シャドウ　インスタンス生成用
 * @author ilearning
 *
 */
public class Shadow extends Monster{

	private static final int SHADOWS_MAX_HP = 120;						// ＨＰ
	private static final int SHADOWS_MAX_MP = 60;						// 最大ＭＰ
	private static final int SHADOWS_DEFENSE = 34;						// 守備力
	private static final int SHADOWS_OFFENSE = 45;						// 攻撃力

	// ②
	// 021 private static final boolean SHADOWS_CAN_MAGIC_ATTACK = true;	// ②魔法攻撃
	// 021 private static final boolean SHADOWS_CAN_HEALING = false;		// ②回復魔法
	private static final int SHADOWS_MAGIC_COEFFICIENT = 5;				// ②魔法係数
	private static final int SHADOWS_MAGIC_COST = 10;					// ②消費MP
	private static final int ATTACK_RATE = 85;							// 021攻撃率

	private CommandSelecter command;										// 021

	public Shadow() {
		super(SHADOWS_MAX_HP, SHADOWS_MAX_MP, SHADOWS_DEFENSE, SHADOWS_OFFENSE,
				// 021 SHADOWS_CAN_MAGIC_ATTACK, SHADOWS_CAN_HEALING,		// ②
				SHADOWS_MAGIC_COEFFICIENT, SHADOWS_MAGIC_COST			// ②
				);
		setName(this.getClass().getSimpleName());
		this.command = new CommandSelecterB();								// 021
	}
	// 021 このメソッドはCharacterクラスから継承
	@Override
	public int getNextCommand() {
		return command.selectCommand(ATTACK_RATE);
	}
}
