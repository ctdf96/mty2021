package library;

import java.util.Random;

import Interface.CommandSelecter;

/**
 * 魔法を使用できないキャラクタ用コマンドセレクタ
 * 選択肢は	ATTACK
 * 			DEFENSE
 * @author morimoto3
 *
 */
public class CommandSelecterA implements CommandSelecter {

	// 攻撃する率をrate(%)で受け取る
	@Override
	public int selectCommand(int rate) {
		// 呼び出し元に返すコマンド
		int result = 0;

		Random rand = new Random();
		int sel = rand.nextInt(100);
		// 出現率計算　0-99のランダム数のうち、
		// 引数の値未満ならば攻撃とする
		if (sel < rate) {
			result = Constant.COMMAND_ATTACK;
		} else {
			result = Constant.COMMAND_DEFENSE;
		}
		return result;
	}

}
