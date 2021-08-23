import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int item1Price; // 商品金額
		int item1Count; // 商品数量
		int syokei; // 小計
		int tax; // 消費税
		int azukari; // 預かり金額
		int inputNo; // 入力番号

		
		while( true ){
			
			// メニュー画面表示
			System.out.println("------------------------------");
			System.out.println("キャッシュ・レジスター　メニュー");
			System.out.println("１：お会計");
			System.out.println("２：終了");
			System.out.println("------------------------------");
			
			// メニュー番号入力
			inputNo = sc.nextInt();
		
			switch (inputNo) {

			// お会計処理
			case 1:
				
				// 商品点数
				int cnt = 1;
				// 小計をリセット
				syokei = 0;
				
				do{

					while(true){
						System.out.print("商品" + cnt + "の金額を入力してください：\\");
						item1Price = sc.nextInt();
						if (item1Price < 0) {
							System.err.println("入力金額が不正です。");
							
						}else{
							break;
						}
					}
	
					while(true){
						System.out.print("商品" + cnt + "の数量を入力してください：");
						item1Count = sc.nextInt();
						if (item1Count < 0) {
							System.err.println("入力数量が不正です。");

						}else{
							break;
						}

					}
					// 小計の計算
					syokei += (item1Price * item1Count);
	
					System.out.println("次の商品？(Yes=1 / No=2)：");
					inputNo = sc.nextInt();

					// 次の入力用に商品点数をプラス
					cnt++;

				}while(inputNo == 1);
				
				// 小計の表示
				System.out.println("小計：\\" + syokei);

				// 消費税の計算と表示
				tax = (int) (syokei * 0.1);
				System.out.println("消費税：\\" + tax);

				// 合計額の表示
				System.out.println("合計：\\" + (syokei + tax));

				// お預かり金額の入力
				System.out.print("お預かり：\\");
				azukari = sc.nextInt();
				if (azukari < 0) {
					System.err.println("入力金額が不正です。システムを終了します。");
					System.exit(-1);

				} else if (azukari < (syokei + tax)) {
					System.err.println("お預かり金額が合計額より少ないです。システムを終了します");
					System.exit(-3);
				}

				System.out.println("お釣り：\\" + (azukari - syokei - tax));

				break;

				
			// システム終了
			case 2:
				
				System.out.println("システムを終了します。");
				//入力ストリームのクローズ
				sc.close();
				System.exit(0);

			//メニュー再表示
			default:
				System.out.println("正しい番号を入力してください。");
				
			}
		}
	
	}

}
