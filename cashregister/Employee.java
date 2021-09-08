package cashregister;

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
			
			public void execute(int inputNo) {//inputNo（入力された番号）を引数とするメソッド
				switch (inputNo) {
					case 1:
						// 会計処理　total += itemPrice * itemCount;
						System.out.println("会計処理を行います");
						System.out.println();
						
//						//計算機能(いったんここに書く)
//					do {
//						while (true) { // true の間　繰り返す
//							
//						Scanner sc = new Scanner(System.in);//数字が入る前提
//						System.out.println("商品コードを入力してください：");
//						inputNo = sc.nextInt();
//						
//						//商品コードを検索して、金額を調べる
////						int i;
////						for(i = 0; i < Main.items.length; i++) {
////							if(items[i] ==itemNo) {
////								itemPrice = ItemPriceArray[i];						
//						
//						
//						}
//						
//						}while(true);
//
//
//
////							break;
////						}
////					}
////					if (i == ItemCodeArray.length) {
////						System.out.println("商品が見つかりませんでした。");
////					} else {
////						break;
////					}
////						}
////						
////						while(true) {
////							
////						}
//						
						break;
						
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

			// 会計処理

			// System.out.print("商品番号を入力してください:");
			// inputNo = sc.nextInt();

			// // 商品番号を調べる
			// for (Item i : items) {
			// if (i.getItemNo() == inputNo) {
			// System.out.println(i.getItemName());
			// System.out.println(i.getPrice());
			// }
			// }


			// 精算処理



			// ログアウト

}