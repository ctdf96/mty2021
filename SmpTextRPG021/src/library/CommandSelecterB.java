package library;

import java.util.Random;

import Interface.CommandSelecter;

/**
 * 攻撃魔法を使用できるキャラクタ用コマンドセレクタ
 * 選択肢は	ATTACK	MAGIC
 * 			DEFENSE
 * 			魔法はATTACK選択時、50%でMAGICを選ぶ
 * @author morimoto3
 *
 */
public class CommandSelecterB implements CommandSelecter {

	// 攻撃する率をrate(%)で受け取る
	@Override
	public int selectCommand(int rate) {
		// 呼び出し元に返すコマンド
		int result = 0;
		// 攻撃選択時、魔法を選択する率
		int magicRate = 50;

		Random rand = new Random();
		int sel = rand.nextInt(100);

		// 出現率計算　0-99のランダム数のうち、
		// 引数の値未満ならば攻撃とする
		if (sel < rate) {

			int sel2 = rand.nextInt(100);

			// sel2で作成したランダム値が
			// magicRate未満であれば魔法攻撃とする
			if (sel2 < magicRate) {
				result = Constant.COMMAND_MAGIC;
			} else {
				result = Constant.COMMAND_ATTACK;
			}

		} else {
			result = Constant.COMMAND_DEFENSE;
		}
		return result;
	}
}
