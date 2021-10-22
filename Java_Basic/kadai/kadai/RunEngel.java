package kadai;

public class RunEngel {

	public static void main(String[] args) {		
		int i = args.length;
		
		if(i != 3) {			
			Engel empty = new Engel();		
			empty.explain();
		} else if(i == 3) {
			Engel eng = new Engel(args[2]);
			eng.setFood((double)Integer.parseInt(args[0]));
			eng.setConsumption((double)Integer.parseInt(args[1]));
			eng.show();}
	}
	}
	
	
class Engel{
	
	//フィールド	
	double food;//食糧費
	double consumption;//消費支出
	String name;//氏名

	//コンストラクタ
	public Engel(String name) {
		this.name = name;
	}
	
	//引数なしのコンストラクタ
	public Engel() {
		
	}


	public void setFood(double food) {
		this.food = food;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public double calculation() {
		double ans = (food/consumption)*100;
		return ans;
	}

	public void show() {
		System.out.println( name + "さんのエンゲル係数は" + calculation() + "%です。");
	}
	
	public void explain(){
		System.out.println("第一引数 : 食料費");
		System.out.println("第二引数 : 消費支出");
		System.out.println("第一引数 : 氏名");
		}
}