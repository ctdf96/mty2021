
public class Shop {
	
	private int shopNo;
	private String shopName;
	private String shopAddress;
	private String shopTel;
	private int shopSales;
	
	//newするときに情報をすべて入れてオブジェクトを作りたいので、
			//フィールドにデータを設定するコンストラクタを作成しておく
	public Shop(int shopNo, String shopName, String shopAddress, String shopTel, int shopSales) {
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTel = shopTel;
		this.shopSales = shopSales;
	}

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