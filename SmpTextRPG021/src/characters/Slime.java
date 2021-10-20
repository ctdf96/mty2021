package characters;

import Interface.CommandSelecter;
import library.CommandSelecterB;

/**
 * モンスター名：スライム　インスタンス生成用
 * @author ilearning
 *
 */
public class Slime extends Monster{

	private static final int SLIMES_MAX_HP = 15;							// ＨＰ
	private static final int SLIMES_MAX_MP = 0;							// 最大ＭＰ
	private static final int SLIMES_DEFENSE = 5;							// 守備力
	private static final int SLIMES_OFFENSE = 9;							// 攻撃力

	// ②
	// 021 private static final boolean SLIMES_CAN_MAGIC_ATTACK = false;		// ②魔法攻撃
	// 021 private static final boolean SLIMES_CAN_HEALING = false;			// ②回復魔法
	private static final int SLIMES_MAGIC_COEFFICIENT = 0;				// ②魔法係数
	private static final int SLIMES_MAGIC_COST = 0;						// ②消費MP
	private static final int ATTACK_RATE = 85;							// 021攻撃率

	private CommandSelecter command;										// 021

	public Slime() {
		super(SLIMES_MAX_HP, SLIMES_MAX_MP, SLIMES_DEFENSE, SLIMES_OFFENSE,
				// 021 SLIMES_CAN_MAGIC_ATTACK, SLIMES_CAN_HEALING,			// ②
				SLIMES_MAGIC_COEFFICIENT, SLIMES_MAGIC_COST				// ②
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