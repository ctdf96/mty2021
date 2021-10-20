package library;

/**
 * コンスタントクラス：定数等をここに定義
 * @author ilearning
 *
 */
public class Constant {

	public static final int MODE_NEWGAME = 1;			// ゲームモード：新規登録
	public static final int MODE_CONTINUE = 2;			// ゲームモード：継続

	public static final int COMMAND_ATTACK = 1;			// コマンド：攻撃
	public static final int COMMAND_DEFENSE = 2;			// コマンド：守備
	public static final int COMMAND_MAGIC = 3;			// コマンド：魔法	②
	public static final int COMMAND_HEAL = 4;			// コマンド：回復	②

	public static final int BATTLE_WIN = 1;				// バトル判定　バトル勝利
	public static final int BATTLE_LOSE = 2;				// バトル判定　バトル全滅
	public static final int BATTLE_EXIT = 9;				// バトル判定　バトル中止

	public static final String INPUT_END = "e";          // 終了

	// 新規登録の職業一覧
	public static final String[] jobList = {
		"No job name 	 hp		mp		守備	攻撃	魔法",
		"1:	Fighter		108		 0		 10		 42		x",
		"2:	Mage		 55		50		 10		  5		attack",
		"3:	Hero		 72		20		 20		 30		heal",
		"4:	Knight		 83		10		 30		 35		x",
		"5:	Healer		 41		50		 10		  3		heal"
		};










}
