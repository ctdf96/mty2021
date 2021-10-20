package characters;

import Interface.CommandSelecter;
import library.CommandSelecterB;
import library.Library;

/**
 * メンバー職業名：メイジ　インスタンス生成用
 * @author ilearning
 *
 */
public class Mage extends Human {

	public final String myJobName;												// 職業名

	private static final int MAGES_MAX_HP = 55;								// 最大ＨＰ
	private static final int MAGES_MAX_MP = 50;								// 最大ＭＰ
	private static final int MAGES_DEFENSE = 10;								// 守備力
	private static final int MAGES_OFFENSE = 5;								// 攻撃力

	// 021 private static final boolean MAGES_CAN_MAGIC_ATTACK = true;			// ②魔法攻撃
	// 021 private static final boolean MAGES_CAN_HEALING = false;				// ②回復魔法
	private static final int MAGES_MAGIC_COEFFICIENT = 2;					// ②魔法係数
	private static final int MAGES_MAGIC_COST = 5;							// ②消費MP
	private static final int ATTACK_RATE = 45;								// 021攻撃率

	private CommandSelecter command;											// 021

	public Mage() {
		super(MAGES_MAX_HP, MAGES_MAX_MP, MAGES_DEFENSE, MAGES_OFFENSE,
				// 021 MAGES_CAN_MAGIC_ATTACK, MAGES_CAN_HEALING,				// ②
				MAGES_MAGIC_COEFFICIENT, MAGES_MAGIC_COST					// ②
				);

		myJobName = Library.adjustPadding(this.getClass().getSimpleName());	// ②
		super.setJobName(myJobName);											// ②
		this.command = new CommandSelecterB();									// 021
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
				+ getHp() + "/" + getMaxHp() + " mp:" + getMp() + "/" + getMaxMp()
				+ "魔法攻撃";
	return myInfo;
	};

}
