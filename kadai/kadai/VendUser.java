package kadai;

class Vending{
	String goodsName = "Coffee";
	int goodsPrice = 130;
	int payment = 200;
	
	void setGoodsName(String name) {
		goodsName = name;
	}
	
	void setGoodsPrice(int price) {
		goodsPrice = price;
	}
	
	void setPayment(int money) {
		payment = money;
	}
	
	void disp() {
		System.out.println("GoodsName :" + goodsName);
		System.out.println("GoodsPrice:" + goodsPrice);
		System.out.println("Payment	  :" + payment);
	}
}

class VendUser {
	public static void main(String[] args) {
		Vending test = new Vending();
		test.disp();
	}
}
