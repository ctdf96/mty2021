package characters;

import Interface.CommandSelecter;
import library.CommandSelecterC;
import library.Library;

/**
 * メンバー職業名：ヒーラー（回復者）　インスタンス生成用
 * @author ilearning
 *
 */
public class Healer extends Human {

	public final String myJobName;												// 職業名

	private static final int HEALERS_MAX_HP = 41;							// 最大ＨＰ
	private static final int HEALERS_MAX_MP = 50;							// 最大ＭＰ
	private static final int HEALERS_DEFENSE = 10;							// 守備力
	private static final int HEALERS_OFFENSE = 3;							// 攻撃力

	// 021 private static final boolean HEALERS_CAN_MAGIC_ATTACK = false;		// ②魔法攻撃
	// 021 private static final boolean HEALERS_CAN_HEALING = true;				// ②回復魔法
	private static final int HEALERS_MAGIC_COEFFICIENT = 10;				// ②魔法係数
	private static final int HEALERS_MAGIC_COST = 5;							// ②消費MP
	private static final int ATTACK_RATE = 25;								// 021攻撃率

	private CommandSelecter command;											// 021

	public Healer() {
		super(HEALERS_MAX_HP, HEALERS_MAX_MP, HEALERS_DEFENSE, HEALERS_OFFENSE,
				// 021 HEALERS_CAN_MAGIC_ATTACK, HEALERS_CAN_HEALING,			// ②
			HEALERS_MAGIC_COEFFICIENT, HEALERS_MAGIC_COST					// ②
		);

		myJobName = Library.adjustPadding(this.getClass().getSimpleName());	// ②
		super.setJobName(myJobName);											// ②
		this.command = new CommandSelecterC();									// 021

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
				+ " 回復魔法";
		return myInfo;
	}

}
