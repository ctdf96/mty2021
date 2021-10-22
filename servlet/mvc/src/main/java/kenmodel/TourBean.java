package kenmodel;

import java.io.Serializable;

public class TourBean implements Serializable {
	private String tourId; 	//ツアーID
	private String tourName;	//ツアー名
	private String place;	//行き先
	private int price;	//大人１人料金
	private int numAdult;	//大人参加人数
	private int numChild;		//子供参加人数


	public String getTourId() {
		return tourId;
	}
	public void setTourId(String tourId) {
		this.tourId = tourId;
	}

	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumAdult() {
		return numAdult;
	}
	public void setNumAdult(int numAdult) {
		this.numAdult = numAdult;
	}
	public int getNumChild() {
		return numChild;
	}
	public void setNumChild(int numChild) {
		this.numChild = numChild;
	}

	//合計人数を取得するメソッド
	public int getNumPeople() {
		return numAdult + numChild;
	}

	//合計料金を取得するメソッド
	public int getTotalAmount() {
		int adPrice = numAdult * price;
		int chPrice = numChild * price /2 ;
		int totalPrice = adPrice + chPrice;
		// 合計人数が4名以上の場合は1割引き
		if (getNumPeople() >= 4) 	{
			totalPrice = (int)(totalPrice * 0.9);
		}
		return totalPrice;
	}
}