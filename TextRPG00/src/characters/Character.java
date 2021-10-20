package characters;

/**
 * 登場するすべてのキャラクターに共通する最上位superクラス
 * @author ilearning
 *
 */
public class Character {
	private String name;						// 名前
	private int hp;							// ｈｐ
	private int mp;							// ｍｐ
	private int defense;						// 守備力
	private int offense;						// 攻撃力
	private int nextCommand;					// 攻撃時のコマンド（constant NEXT_COMMAND_XX参照）

	public Character(int hp, int mp, int defense, int offense) {
		this.hp = hp;
		this.mp = mp;
		this.defense = defense;
		this.offense = offense;
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
	public void setNextCommand(int nextCommand) {
		this.nextCommand = nextCommand;
	}
	public int getNextCommand() {
		return this.nextCommand;
	}

	/**
	 * キャラクタの現在情報を返す
	 */
	@Override
	public String toString() {
		return "名前:" + name + " hp:" + hp + " mp:" + mp;
	}



}
