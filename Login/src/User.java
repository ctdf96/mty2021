import java.util.Scanner;

public class User {
//	フィールドの宣言
	String userId;//ユーザーID
	String password;//パスワード
	int incorrect;//ユーザーは間違えた回数を保持しているとする
	
//	ログインする
	void login() {
//		ユーザー名とパスワードを入力する　→　キーボードから入力する
		Scanner sc = new Scanner(System.in);
		String userName = sc.next(); //入力の戻り値を文字列として変数useNameで受ける
		String password = sc.next(); //入力の戻り値を文字列として変数passwordで受ける
		
//		ユーザー名とパスワードを検索する　※一致しているか検索する
		if( this.userId.equals(userName) && this.password.equals(password)) {//入力されたユーザーIDが一致かつパスワードが一致
			System.out.println("ログイン成功");
			this.incorrect = 0;//ログインの失敗回数がたまっていくのでログインしたら失敗回数をリセットする
		} else {
			//間違った場合、間違った回数を保存する
			this.incorrect++;
		}
		
//		３回間違ったかどうか確認する	
		int incorrect = chkLoginCnt();
//		３回間違っていたらシステムを終了する	
		if (incorrect == 3){
			System.out.println("3回間違ったためシステムを終了します。");
			System.exit(-1);//プログラムを終わらせる
			
		}
}
	
//	ログインの試行回数をチェックする ｎ回間違ったらｎが返る
	int chkLoginCnt() {
return this.incorrect;
	}
}


