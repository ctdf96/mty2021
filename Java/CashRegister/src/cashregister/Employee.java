package cashregister;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

			private int empNo;//従業員コード
			private String empName;//名前
			private int empRank;//ランク（区分）

			//newするときに情報をすべて入れてオブジェクトを作りたいので、
			//フィールドにデータを設定するコンストラクタを作成しておく
			public Employee(int empNo, String empName, int empRank) {
				this.empNo = empNo;
				this.empName = empName;
				this.empRank = empRank;
			}


			//取得するメソッド(getter)と代入するメソッド(setter)を前もって作成しておく
			public int getEmpNo() {
				return empNo;
			}

			public void setEmpNo(int empNo) {
				this.empNo = empNo;
			}

			public String getEmpName() {
				return empName;
			}

			public void setEmpName(String empName) {
				this.empName = empName;
			}

			public int getEmpRank() {
				return empRank;
			}

			public void setEmpRank(int empRank) {
				this.empRank = empRank;
			}

//			メニュー表示用のメソッド
			public void dispMenu() {
				//呼び出された際の引数を見て、自分のランクが1の場合
				if (this.empRank == 1) {
					// 管理者メニューを表示する
					System.out.println("------------------------------");
					System.out.println("キャッシュ・レジスター　メニュー");
					System.out.println("1：お会計");
					System.out.println("2：精算");
					System.out.println("4：ログアウト");
					System.out.println("------------------------------");

				//自分のランクが2あるいは3の場合
				} else if (this.empRank == 2 || this.empRank == 3) {
					// パート・アルバイトメニューを表示する
					System.out.println("------------------------------");
					System.out.println("キャッシュ・レジスター　メニュー");
					System.out.println("1：お会計");
					System.out.println("4：ログアウト");
					System.out.println("------------------------------");
				}
			}

			public void execute(int inputNo, ArrayList<Item> items, ArrayList<Sales> sales) {//inputNo（入力された番号）とアイテム情報、売上情報を引数とするメソッド
				Scanner sc = new Scanner(System.in);
//				try {
				//入力された番号に対応した処理を行う
				switch (inputNo) {

					case 1:
						// 会計処理
						System.out.println("会計処理を行います");
						System.out.println();

						//商品情報表示
						int find = 0;
						Item item = null;//見つかった商品を入れる空の変数を用意
						do{	
							System.out.print("商品コードを入力してください：");
						int itemNo = sc.nextInt();
						if(itemNo <= items.size() && itemNo >= 0) {
						System.out.println("商品コード（" + itemNo + "）" + items.get(itemNo-1).getItemName() + "は1個 "+ items.get(itemNo-1).getPrice() + "円です");
						System.out.println();
						find = 1;
						} else {
							System.err.println("商品が見つかりませんでした。");
							find = 0;
							System.out.println();
							System.out.println();
							}} while(find == 0);

						//見つかった商品情報を用意した空の変数に代入
						System.out.println("数量を入力してください：");
						int itmCount = sc.nextInt();
						//TODO 数字以外はダメ
						
						if (itmCount < 0) {
							System.err.println("数量が不正です。システムを終了します。");
							System.exit(-1);
						} else {
						//計算式
						
							
							
							
							
							
							
							
						}
						break;
//						//商品コードを検索して、商品情報を表示
//						Item item = null;//見つかった商品を入れる空の変数
//						for (Item i : items) {//拡張for文　itemsの中にある商品すべてを取り出す
//
//							if (i.getItemNo() == itemNo) {
//								item = i;
//							}


//
//
//
////							break;
////						}
////					}

////						}



//				catch (InputMismatchException e) {//文字が入力される場合に備える エラーが発生したらキャッチ
//				System.err.println("メニュー番号は1～4の整数で入力してください");
//				System.out.println();
//
//				//改行が読み捨てられるためダミー行を追加
//				System.out.println();
//				//Scannerのバッファを読み捨てる処理
//				sc.next();
//			}

					case 2:
						// 精算処理
						if (this.empRank == 1) {
							System.err.println("現在、清算機能は未実装です。他の番号を入力してください");
							System.out.println();
						} else {
							System.err.println("2は無効な番号です。他の番号を入力してください");
							System.out.println();}
						break;

					case 3:
						System.err.println("現在、3.在庫管理機能は未実装です。他の番号を入力してください");
						System.out.println();
						break;

					case 4:
						// ログアウト
						System.err.println("ログアウトしてログイン画面に戻ります。");
						break;

					default:
						System.err.println("メニュー番号は1～4の範囲内で入力してください");
						System.out.println();
						break;
				}
			}



			// 精算処理



			// ログアウト
}