package cashregister;

public class Shop {
	
	private int shopNo;//店舗no.
	private String shopName;//店舗名
	private String shopAddress;//住所
	private String shopTel;//TEL
	private int shopSales;//１日の総売り上げ
	
	//newするときに情報をすべて入れてオブジェクトを作りたいので、
	//フィールドに初期値を設定するコンストラクタを作成しておく
	public Shop(int shopNo, String shopName, String shopAddress, String shopTel, int shopSales) {
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTel = shopTel;
		this.shopSales = shopSales;
	}

	//取得するメソッド(getter)と代入するメソッド(setter)を前もって作成しておく
	public int getShopNo() {
		return shopNo;
	}

	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopTel() {
		return shopTel;
	}

	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	public int getShopSales() {
		return shopSales;
	}

	public void setShopSales(int shopSales) {
		this.shopSales = shopSales;
	}
}
