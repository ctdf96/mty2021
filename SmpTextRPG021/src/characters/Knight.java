package characters;

import Interface.CommandSelecter;
import library.CommandSelecterA;
import library.Library;

/**
 * メンバー職業名：ナイト　インスタンス生成用
 * @author ilearning
 *
 */
public class Knight extends Human {

	public final String myJobName;												// 職業名

	private static final int KNIGHTS_MAX_HP = 83;							// 最大ＨＰ
	private static final int KNIGHTS_MAX_MP = 10;							// 最大ＭＰ
	private static final int KNIGHTS_DEFENSE = 30;							// 守備力
	private static final int KNIGHTS_OFFENSE = 35;							// 攻撃力

	// 021 private static final boolean KNIGHTS_CAN_MAGIC_ATTACK = false;		// ②魔法攻撃
	// 021 private static final boolean KNIGHTS_CAN_HEALING = false;			// ②回復魔法
	private static final int KNIGHTS_MAGIC_COEFFICIENT = 8;					// ②魔法係数
	private static final int KNIGHTS_MAGIC_COST = 5;							// ②消費MP
	private static final int ATTACK_RATE = 70;								// 021攻撃率

	private CommandSelecter command;											// 021

	public Knight() {
		super(KNIGHTS_MAX_HP, KNIGHTS_MAX_MP, KNIGHTS_DEFENSE, KNIGHTS_OFFENSE,
				// 021 KNIGHTS_CAN_MAGIC_ATTACK, KNIGHTS_CAN_HEALING,			// ②
				KNIGHTS_MAGIC_COEFFICIENT, KNIGHTS_MAGIC_COST				// ②
				);

		myJobName = Library.adjustPadding(this.getClass().getSimpleName());	// ②
		super.setJobName(myJobName);											// ②
		this.command = new CommandSelecterA();									// 021

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
