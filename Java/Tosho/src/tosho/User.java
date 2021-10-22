package tosho;

public class User {
	private String userId; //利用者ID
	private String name; //氏名
	private String kana; //ふりがな
	private String address; //住所
	private String phoneNo; //電話番号（ハイフンあり）
	private int borrowedCnt; //貸出冊数
	
	public User() {//同じ名前で引数の数や型が違うメソッド　→　オーバーロード
		
	}
	public User(String userId, String name, String kana, String address, String phoneNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.kana = kana;
		this.address = address;
		this.phoneNo = phoneNo;
		this.borrowedCnt = 0;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getKana() {
		return kana;
	}
	public void setKana(String kana) {
		this.kana = kana;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public int getBorrowedCnt() {
		return borrowedCnt;
	}
	public void setBorrowedCnt(int borrowedCnt) {
		this.borrowedCnt = borrowedCnt;
	}		
}