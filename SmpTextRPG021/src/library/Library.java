package library;

/**
 * ライブラリ：プロジェクト全体で使用する関数などをここに定義
 * @author ilearning
 *
 */
public class Library {

	public static boolean isNumeric(String str) {
		boolean res = false;
		try {
	        Integer.parseInt(str);
	        res = true;
	    } catch (NumberFormatException e) {
	    }
		return res;
	}

	/**
	 * 文字列を受け取り、後ろを空白で埋めて７桁にして返す
	 * @param str
	 * @return
	 */
	public static String adjustPadding(String str) {
	    String paddingStr = String.format("%-7s", str);
	    return paddingStr;
	}
	/**
	 * コマンドセレクタのインタンスを受け取り、実体を判定してこれに対応する情報を返す
	 * @param command
	 * @return
	 */
	/* 021
	public static String setOptionInfo(CommandSelecter command) {
		String result = "";
		// 021 インスタンスの実体がBの場合
		if (command instanceof CommandSelecterB) {
			result = " 攻撃魔法";

			// 021 インスタンスの実体がCの場合
		} else if (command instanceof CommandSelecterC) {
			result = " 回復魔法";

			// 021 インスタンスの実体がDの場合
		} else if (command instanceof CommandSelecterD) {
			result = " 攻撃、回復魔法";
		}

		// 021 インスタンスの実体がAの場合は不要
		return result;
	}
021 */



}
