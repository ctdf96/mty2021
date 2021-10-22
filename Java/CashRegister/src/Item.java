
public class Item {
//フィールドを作成
private int itemNo;	//	商品No.
private String itemName;//	商品名
private ItemKubun kubun;//	商品区分
private int price;	//	商品単価
//	数量情報はこのクラスには要らない

//newするときに情報をすべて入れてオブジェクトを作りたいので、
//フィールドにデータを設定するコンストラクタを作成しておく
public	Item(int itemNo, String itemName, ItemKubun kubun, int price) {
	this.itemNo =itemNo;
	this.itemName = itemName;
	this.kubun = kubun;
	this.price = price;
}

	
//	設定するメソッド(getter)と代入するメソッド(setter)を前もって作成しておく
public int getItemNo() {//商品番号を取り出して代入する
	return itemNo;
}


public void setItemNo(int itemNo) {//どこかのプログラムから数字データをとってくる
	this.itemNo = itemNo;
}


public String getItemName() {
	return itemName;
}


public void setItemName(String itemName) {
	this.itemName = itemName;
}


public ItemKubun getKubun() {
	return kubun;
}


public void setKubun(ItemKubun kubun) {
	this.kubun = kubun;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}}
