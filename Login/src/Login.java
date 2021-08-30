
public class Login {

	public static void main(String[] args) {
		User user1 = new User();//誰がログインするかわからない　ユーザーを管理するためのクラスを用意するのが良さそう
		user1.userId ="user1";
		user1.password="0123";
		user1.incorrect= 0;
		
		while(true) {//三回間違うと終わるのでいったん無限ループにする
		user1.login();
		}
	}

}
