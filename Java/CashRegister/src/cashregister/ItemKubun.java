package cashregister;

public class ItemKubun {
	int kubunNo;
	String KubunName;
	
	//コンストラクタ
	public ItemKubun(int kubunNo, String kubunName) {
		this.kubunNo = kubunNo;
		KubunName = kubunName;
	}

	
	//取得するメソッド(getter)と代入するメソッド(setter)を前もって作成しておく
	public int getKubunNo() {
		return kubunNo;
	}

	public void setKubunNo(int kubunNo) {
		this.kubunNo = kubunNo;
	}

	public String getKubunName() {
		return KubunName;
	}

	public void setKubunName(String kubunName) {
		KubunName = kubunName;
	}
}
