package characters;

import Interface.CommandSelecter;
import library.CommandSelecterB;

/**
 * モンスター名：デビル　インスタンス生成用
 * @author ilearning
 *
 */
public class Devil extends Monster{

	private static final int DEVILS_MAX_HP = 300;						// ＨＰ
	private static final int DEVILS_MAX_MP = 100;						// 最大ＭＰ
	private static final int DEVILS_DEFENSE = 35;						// 守備力
	private static final int DEVILS_OFFENSE = 40;						// 攻撃力

	// ②
	// 021 private static final boolean DEVILS_CAN_MAGIC_ATTACK = true;		// ②魔法攻撃
	// 021 private static final boolean DEVILS_CAN_HEALING = false;			// ②回復魔法
	private static final int DEVILS_MAGIC_COEFFICIENT = 8;				// ②魔法係数
	private static final int DEVILS_MAGIC_COST = 10;						// ②消費MP
	private static final int ATTACK_RATE = 70;							// 021攻撃率

	private CommandSelecter command;										// 021

	public Devil() {
		super(DEVILS_MAX_HP, DEVILS_MAX_MP, DEVILS_DEFENSE, DEVILS_OFFENSE,
				// 021 DEVILS_CAN_MAGIC_ATTACK, DEVILS_CAN_HEALING,			// ②
				DEVILS_MAGIC_COEFFICIENT, DEVILS_MAGIC_COST				// ②
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
