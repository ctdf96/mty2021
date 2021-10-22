
public class ExpantionCode {

	public static void main(String[] args) {
		int iValue = 10;
		double dValue;
		dValue = iValue; //double型の変数に対してint型のデータを代入
		System.out.println("拡大変換：int型の"+ iValue + "から、double型の" + dValue);

//		int型 * double型の計算結果はdouble型
		double ans = 10 * 2.5;
		System.out.println("計算結果は"+ ans + "です。");

		byte bValue;
		bValue = 10;

		bValue = (byte) 500; //目に見えないところで削られる
		System.out.println(bValue);
		iValue = 20;
		bValue = (byte) iValue;
		System.out.println(bValue);

	}

}
