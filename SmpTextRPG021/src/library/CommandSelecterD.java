package library;

import java.util.Random;

import Interface.CommandSelecter;

/**
 * 回復、攻撃の両方を使用できるキャラクタ用コマンドセレクタ
 * 選択肢は	ATTACK	MAGIC、HEAL
 * 			DEFENSE
 * 			ATTACK選択時、40%で魔法を選ぶ
 * 			魔法選択時、30%でHEALを選ぶ
 * @author morimoto3
 *
 */
public class CommandSelecterD implements CommandSelecter {

	// 攻撃する率をrate(%)で受け取る
	@Override
	public int selectCommand(int rate) {
		// 呼び出し元に返すコマンド
		int result = 0;
		// 攻撃選択時、魔法を選択する率
		int magicRate = 40;
		// 魔法選択時、回復を選択する率
		int healRate = 30;

		Random rand = new Random();
		int sel = rand.nextInt(100);

		// 出現率計算　0-99のランダム数のうち、
		// 引数の値未満ならば攻撃とする
		if (sel < rate) {

			int sel2 = rand.nextInt(100);

			// sel2で作成したランダム値が
			// magicRate未満であれば魔法とする
			if (sel2 < magicRate) {

				int sel3 = rand.nextInt(100);

				// sel3のランダム値がhealRate未満なら
				// 回復魔法とし、それ以外なら攻撃魔法とする
				if (sel3 < healRate) {
					result = Constant.COMMAND_HEAL;
				} else {
					result = Constant.COMMAND_MAGIC;
				}
			} else {
				result = Constant.COMMAND_ATTACK;
			}

		} else {
			result = Constant.COMMAND_DEFENSE;
		}
		return result;
	}
}
