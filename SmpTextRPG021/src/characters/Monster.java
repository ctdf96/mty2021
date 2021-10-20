package characters;

/**
 * 本クラスはモンスターを統括するSuperクラス
 * @author ilearning
 *
 */
public abstract class Monster extends Character {

	private final int MAX_HP;													// MAX HP
	private final int MAX_MP;													// MAX MP
	// 021 private CommandSelecter command;										// 021
	// 021  private final int attackRate;										// 021

	// Characterクラスの変数に値をセットする
	public Monster(int max_hp, int max_mp, int defense, int offense,
			// 021 boolean canMagicAttack, boolean canHealing,					// ②
			int magicCoefficient, int magicCost									// ②
			) {
		super(max_hp, max_hp, defense, offense,
				// 021 canMagicAttack, canHealing,								// ②
				magicCoefficient, magicCost);									// ②
		this.MAX_HP = max_hp;
		this.MAX_MP = max_mp;
		// 021 this.attackRate = attackRate;									// 021
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

	// キャラクタの現在の情報を返す
	public String getNowInfo() {
//		return  getName() + " hp:" + 	getHp() + " mp:" + getMp();
		return super.toString();
	}

}
