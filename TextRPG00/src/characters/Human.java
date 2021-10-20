package characters;

/**
 * 本クラスはプレーヤー及びその仲間のキャラクタを統括するSuperクラス
 * @author ilearning
 * 	最大㏋値、最大MP値の変数はここで持つが、値はサブクラスでセットする
 *
 */
public class Human extends Character {

	private final int MAX_HP;					// MAX HP
	private final int MAX_MP;					// MAX MP

	public Human(int max_hp, int max_mp, int defense, int offense) {
		super(max_hp, max_hp, defense, offense);
		this.MAX_HP = max_hp;
		this.MAX_MP = max_mp;
	}

	public int getMaxHp() {
		return this.MAX_HP;
	}
	public int getMaxMp() {
		return this.MAX_MP;
	}

}
