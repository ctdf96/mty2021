package characters;

import Interface.CommandSelecter;
import library.CommandSelecterA;
import library.Library;

/**
 * メンバー職業名：ファイター　インスタンス生成用
 * @author ilearning tmorimoto
 *
 */
public class Fighter extends Human {

	public final String myJobName;											// 職業名

	private static final int FIGHTERS_MAX_HP = 108;						// 最大ＨＰ
	private static final int FIGHTERS_MAX_MP = 0;						// 最大ＭＰ
	private static final int FIGHTERS_DEFENSE = 10;						// 守備力
	private static final int FIGHTERS_OFFENSE = 42;						// 攻撃力

	// 021 private static final boolean FIGHTERS_CAN_MAGIC_ATTACK = false;	// ②魔法攻撃
	// 021 private static final boolean FIGHTERS_CAN_HEALING = false;			// ②回復魔法
	private static final int FIGHTERS_MAGIC_COEFFICIENT = 0;			// ②魔法係数
	private static final int FIGHTERS_MAGIC_COST = 0;					// ②消費MP
	private static final int ATTACK_RATE = 80;							// 021 攻撃率

	private CommandSelecter command;										// 021

	public Fighter() {
		super(FIGHTERS_MAX_HP, FIGHTERS_MAX_MP, FIGHTERS_DEFENSE, FIGHTERS_OFFENSE,
				// 021 FIGHTERS_CAN_MAGIC_ATTACK, FIGHTERS_CAN_HEALING,		// ②
				FIGHTERS_MAGIC_COEFFICIENT, FIGHTERS_MAGIC_COST			// ②
				);

		myJobName = Library.adjustPadding(this.getClass().getSimpleName());
		super.setJobName(myJobName);										// ②
		this.command = new CommandSelecterA();								// 021
	}

	// 021 このメソッドはCharacterクラスから継承
	@Override
	public int getNextCommand() {
		return command.selectCommand(ATTACK_RATE);
	}

	// 021 このメソッドはHumanクラスから継承
	@Override
	public String getDetailsInfo() {
		String myInfo = myJobName + ":" + getName() + " hp:"
				+ getHp() + "/" + getMaxHp() + " mp:" + getMp() + "/" + getMaxMp();
	return myInfo;
	};

}
