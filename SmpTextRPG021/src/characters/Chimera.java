package characters;

import Interface.CommandSelecter;
import library.CommandSelecterB;

/**
 * モンスター名：キメラ　インスタンス生成用
 * @author ilearning
 *
 */
public class Chimera extends Monster{

	private static final int CHIMERAS_MAX_HP = 20;						// ＨＰ
	private static final int CHIMERAS_MAX_MP = 30;						// 最大ＭＰ
	private static final int CHIMERAS_DEFENSE = 10;						// 守備力
	private static final int CHIMERAS_OFFENSE = 15;						// 攻撃力

	// ②
	// 021 private static final boolean CHIMERAS_CAN_MAGIC_ATTACK = true;	// ②魔法攻撃
	// 021 private static final boolean CHIMERAS_CAN_HEALING = false;		// ②回復魔法
	private static final int CHIMERAS_MAGIC_COEFFICIENT = 3;			// ②魔法係数
	private static final int CHIMERAS_MAGIC_COST = 5;					// ②消費MP
	private static final int ATTACK_RATE = 65;							// 021攻撃率

	private CommandSelecter command;										// 021

	public Chimera() {
		super(CHIMERAS_MAX_HP, CHIMERAS_MAX_MP, CHIMERAS_DEFENSE, CHIMERAS_OFFENSE,
				// 021 CHIMERAS_CAN_MAGIC_ATTACK, CHIMERAS_CAN_HEALING,		// ②
				CHIMERAS_MAGIC_COEFFICIENT,  CHIMERAS_MAGIC_COST		// ②
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
