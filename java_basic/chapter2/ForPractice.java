
public class ForPractice {

	public static void main(String[] args) {
		//1~100まで加算した結果を表示するプログラム
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		//1~100までの数値の中で偶数のみ出力するプログラム
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		//3の倍数のみ出力する
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		//		9x9の表を作る
		/*
		 * 1 2 3 4 5 6 7 8 9
		 * 2 4 6 8 10 12 14 16 18
		 * 3 6 9 12 15 18 21 24 27
		 * 	:
		 * 	:
		 * 9 18 27 36 45 54 63 72 81
		 *
		 *   	 */
		for (int i = 1; i <= 9; i++) {//変数iは行（1～9）
			//			行が１の間、

			for (int j = 1; j <= 9; j++) {//変数jは列（1～9）

				System.out.print(i * j + " ");
			}
			System.out.println();
		}


int k = 1;
while(k <= 9) {

int l =1;
while(l <= 9) {
	System.out.print(k * l +"");
	l++;
	}
	System.out.println();
	k++;
	}

//出席番号が51の学生を見つける

for(int i = 1;1<=100;i++) {
	if(i==51) {
		break;
		}

}

for(int i =1;i<=10;i++) {
	if(i==5) {
		continue;
		}
	System.out.println("飲み会の案内をする");
	}
}
	}
