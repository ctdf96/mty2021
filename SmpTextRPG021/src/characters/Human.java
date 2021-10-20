package characters;

import library.Library;

/**
 * 本クラスはプレーヤー及びその仲間のキャラクタを統括するSuperクラス
 * @author ilearning
 * 	最大㏋値、最大MP値の変数はここで持つが、値はサブクラスでセットする
 *
 */
public abstract class Human extends Character {

	private String jobName;										// ジョブ名

	private final int MAX_HP;									// MAX HP
	private final int MAX_MP;									// MAX MP
	// 021 private CommandSelecter command;						// 021NG
	// private final int attackRate;							// 021

	public Human(int max_hp, int max_mp, int defense, int offense,
			// 021 boolean canMagicAttack, boolean canHealing, 	// ②
			int magicCoefficient, int magicCost					// ②
			) {
		super(max_hp, max_mp, defense, offense,
				// 021 canMagicAttack, canHealing,				// ②
				magicCoefficient, magicCost);					// ②
		this.MAX_HP = max_hp;
		this.MAX_MP = max_mp;
		// 021 this.attackRate = attackRate;
/* 021
		// 021NG 自身のインスタンスの実体によりCommandSelecterの実体を切り替える
		if (this instanceof Fighter) {
			this.command = new CommandSelecterA();
		} else if (this instanceof Healer) {
			this.command = new CommandSelecterC();
		} else if (this instanceof Hero) {
			this.command = new CommandSelecterC();
		} else if (this instanceof Knight) {
			this.command = new CommandSelecterA();
		} else if (this instanceof Mage) {
			this.command = new CommandSelecterB();
		}
021 */
	}

	public void setJobName(String str) {
		this.jobName = Library.adjustPadding(str);
	}
	public String getJobName() {
		return this.jobName;
	}

	public int getMaxHp() {
		return this.MAX_HP;
	}
	public int getMaxMp() {
		return this.MAX_MP;
	}

/* 021
	// 021NG
	@Override
	public int getNextCommand() {
		return command.selectCommand(attackRate);
	}
021 */
	// 021
	// 021 このメソッドはCharacterクラスから継承
	@Override
	public abstract int getNextCommand();

	// キャラクタの現在の簡易情報を返す
	public String getNowInfo() {
		return jobName + ":" + getName() + " hp:" + getHp()
					+ " mp:" + getMp();
	}

	// 抽象メソッド　キャラクタの現在の詳細情報を返す
	public abstract String getDetailsInfo();

}
