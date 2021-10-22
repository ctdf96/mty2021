package java_basic;

public class JavaExam1_1 {

	public static void main(String[] args) {
		int price, num;
		double amount;

		price = 300;
		num = 8;

		amount = num * price;
		if (num >= 10) {
			amount = amount * 0.9;
			System.out.println("合計金額は：" + (int) amount + "円です。");
		}

		else {
			System.out.println("合計金額は：" + (int) amount + "円です。");
		}
	}
}