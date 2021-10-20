package characters;

/**
 * 登場するすべてのキャラクターに共通する最上位superクラス
 * @author ilearning
 *
 */
public abstract class Character {
	private String name;							// 名前
	private int hp;								// ｈｐ
	private int mp;								// ｍｐ
	private int defense;							// 守備力
	private int offense;							// 攻撃力
	// 021 private int nextCommand;					// 攻撃時のコマンド（constant NEXT_COMMAND_XX参照）

	// 021 private boolean canMagicAttack = false;	// ②攻撃魔法使用可不可
	// 021  private boolean canHealing = false;		// ②回復魔法使用可不可
	private int magicCoefficient = 0;				// ②魔法係数
	private int magicCost = 0;						// ②消費mp

	public Character(int hp, int mp, int defense, int offense,
			// 021 boolean canMagicAttack, boolean canHealing, 	// ②
			int magicCoefficient, int magicCost) {  			// ②
		this.hp = hp;
		this.mp = mp;
		this.defense = defense;
		this.offense = offense;
		// 021 this.canMagicAttack = canMagicAttack;			// ②
		// 021 this.canHealing = canHealing;					// ②
		this.magicCoefficient = magicCoefficient;				// ②
		this.magicCost = magicCost;								// ②
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getOffense() {
		return offense;
	}
/*	public void setOffense(int offense) {
		this.offense = offense;
	} */
	public int getDefense() {
		return defense;
	}
/* 021
	public void setNextCommand(int nextCommand) {
		this.nextCommand = nextCommand;
	}
	public int getNextCommand() {
		return this.nextCommand;
	}
021 */
	// 抽象メソッド　攻撃、防御などのコマンドを渡す
	public abstract int getNextCommand();

	// ↓　②
/* 021
	public void setCanMagicAttack(boolean bool) {
		this.canMagicAttack = bool;
	}
	public boolean getCanMagicAttack() {
		return this.canMagicAttack;
	}
	public void setCanHealing(boolean bool) {
		this.canHealing = bool;
	}
	public boolean getCanHealing() {
		return this.canHealing;
	}
021 */

	public int getMagicCoefficient() {
		return this.magicCoefficient;
	}
	public int getMagicCost() {
		return this.magicCost;
	}

	/**
	 * キャラクタの現在情報を返す	最も簡単な内容
	 */
	@Override
	public String toString() {
		return "名前:" + name + " hp:" + hp + " mp:" + mp;
	}

}
