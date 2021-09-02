package kadai;

class Train{
	String name;//列車の名前
	int speed;//最高速度
	int free;//自由席の数
	
	public Train(String name, int speed, int free) {//コンストラクタ
		this.name = name;
		this.speed = speed;
		this.free = free;
	}
	
	void show(){//メソッド
		System.out.println("TrainName: " +name);
		System.out.println("MaxSpeed : "+ speed);
		System.out.println("FreeSeat : "+ free);
	}
	}


class RunTrain {

	public static void main(String[] args) {
		Train densha = new Train("YAMATE",60,10);
		densha.show();
	}

}
