package tosho;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tosho {

	public static void main(String[] args) {
//		西暦の下２桁をシステムから算出する
		LocalDateTime ldt = LocalDateTime.now();  //現在の日時を取得
		System.out.println( ldt );
		
		//ldtの日付文字列から21を取り出すには？
		String str = ldt.toString();// [2](=3文字目)から、[4]の前(4文字目)まで切り出す
		System.out.println(str.substring(2,4)); // 
		
//		21を出力
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy");
		System.out.println(LocalDateTime.now().format(dtf));
		
		//P136-139
		//Userを一人作る
		User user1 = new User(LocalDateTime.now().format(dtf) +"001", "佐藤太郎", "さとうたろう", "愛媛県松山市", "090-1234-5678");
//		User user2 = new User コンストラクタが設定されると何も材料がいらないコンストラクタは明示的に書かなければならない
		//Bookを作る
		Book book1 = new Book("01011", "サンプル書籍", "著者１", "出版社１") ;
//		必要な数だけ作っていく
		
//		利用者カードのIDを読み込む　この段階で貸し出せる数を知らせる？
//		番号がない！
		
		
//		書籍コードを調べる
//		コードがない！
//		貸出冊数が５を超えた（貸出不可）
	}
}
