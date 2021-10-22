

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int i = 1;//1で初期化
		int sum = 0;//0で初期化

		while (i <= 100) {
			sum += i;//iを足す　1→100　　sum += i > sum(1) = sum(0) + i(1),0で始まるので1足しても1　
			//			sumの値は残っている
			i++;//iに1を足す　> i(2)= i(1) + 1 ,......i(101)=i(100) +1 1から100まで有効
		}
		System.out.println(sum);

		Scanner sc = new Scanner(System.in);

		//999が入力されるまで繰り返す

		int num = 0;
		do {
			num = sc.nextInt();//判定するには必ず一回は入力がいる
		}
		while (num != 999);//～の間／になるまで
		}
	}


