
public class ScoreAverage {

	public static void main(String[] args) {
		int[] EngScores = { 80, 70, 100 };
		int[] JpnScores = { 70, 80, 90 };
		int[] MathScores = { 100, 70, 60 };

		//英語の得点を合計する
		int EngSum = 0;
		for (int i = 0; i < EngScores.length; i++) {
			EngSum += EngScores[i];
		}
		//英語の平均点を計算する
		System.out.println("英語の平均点は" + (EngSum / EngScores.length) + "点です");

		int JpnSum = 0;
		for (int i = 0; i < JpnScores.length; i++) {
			JpnSum += JpnScores[i];
		}
		System.out.println("国語の平均点は" + (JpnSum / JpnScores.length) + "点です");

		int MathSum = 0;
		for (int i = 0; i < MathScores.length; i++) {
			MathSum += MathScores[i];
		}
		System.out.println("数学の平均点は" + (MathSum / MathScores.length) + "点です");
	}
}
