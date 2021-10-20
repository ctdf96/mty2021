package library;

/**
 * ライブラリ：プロジェクト全体で使用する関数などをここに定義
 * @author ilearning
 *
 */
public class Library {

	public static boolean isNumeric(String str) {
		boolean res = false;
		try {//数字が入力されたかチェック
	        Integer.parseInt(str);
	        res = true;
	    } catch (NumberFormatException e) {
	    }
		return res;
	}
}
