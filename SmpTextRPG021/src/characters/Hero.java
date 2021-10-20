package characters;

import Interface.CommandSelecter;
import library.CommandSelecterC;
import library.Library;

/**
 * メンバー職業名：ヒーロー　インスタンス生成用
 * @author ilearning
 *
 */
public class Hero extends Human {

	public final String myJobName;												// 職業名

	private static final int HEROS_MAX_HP = 72;								// 最大ＨＰ
	private static final int HEROS_MAX_MP = 20;								// 最大ＭＰ
	private static final int HEROS_DEFENSE = 20;								// 守備力
	private static final int HEROS_OFFENSE = 30;								// 攻撃力

	// 021 private static final boolean HEROS_CAN_MAGIC_ATTACK = false;			// ②魔法攻撃
	// 021 private static final boolean HEROS_CAN_HEALING = true;				// ②回復魔法
	private static final int HEROS_MAGIC_COEFFICIENT = 8;					// ②魔法係数
	private static final int HEROS_MAGIC_COST = 5;							// ②消費MP
	private static final int ATTACK_RATE = 65;								// 021攻撃率

	private CommandSelecter command;											// 021

	public Hero() {
		super(HEROS_MAX_HP, HEROS_MAX_MP, HEROS_DEFENSE, HEROS_OFFENSE,
				// 021 HEROS_CAN_MAGIC_ATTACK, HEROS_CAN_HEALING,				// ②
			HEROS_MAGIC_COEFFICIENT, HEROS_MAGIC_COST						// ②
				);

	myJobName = Library.adjustPadding(this.getClass().getSimpleName());		// ②
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
