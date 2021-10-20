package characters;

import Interface.CommandSelecter;
import library.CommandSelecterB;

/**
 * モンスター名：ラスボス　インスタンス生成用
 * @author ilearning
 *
 */
public class LasBoss extends Monster{

	private static final int LASBOSSS_MAX_HP = 1000;						// ＨＰ
	private static final int LASBOSSS_MAX_MP = 500;						// 最大ＭＰ
	private static final int LASBOSSS_DEFENSE = 4;						// 守備力
	private static final int LASBOSSS_OFFENSE = 50;						// 攻撃力

	// ②
	// 021 private static final boolean LASBOSSS_CAN_MAGIC_ATTACK = true;	// ②魔法攻撃
	// 021 private static final boolean LASBOSSS_CAN_HEALING = false;		// ②回復魔法
	private static final int LASBOSSS_MAGIC_COEFFICIENT = 8;			// ②魔法係数
	private static final int LASBOSSS_MAGIC_COST = 12;					// ②消費MP
	private static final int ATTACK_RATE = 85;							// 021攻撃率

	private CommandSelecter command;										// 021

	public LasBoss() {
		super(LASBOSSS_MAX_HP, LASBOSSS_MAX_MP, LASBOSSS_DEFENSE, LASBOSSS_OFFENSE,
				// 021 LASBOSSS_CAN_MAGIC_ATTACK, LASBOSSS_CAN_HEALING,		// ②
				LASBOSSS_MAGIC_COEFFICIENT, LASBOSSS_MAGIC_COST			// ②
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
