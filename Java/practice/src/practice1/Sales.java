package practice1;

public class Sales extends Employee {
	
	private String area;//担当地域
	
//親クラスで設定した初期設定 変数 id と name については
//	サブクラスでも親クラスのコンストラクタは設定しなければならない
//	サブクラスをnewするときにも必要な情報のため
	public Sales( int id, String name, String area) {
		super(id, name);//親クラスのコンストラクタを呼び出す
		this.area = area;		
	}
	
	public String getArea() {
		return this.area;
	}

	public void display() {
		System.out.print("従業員番号：" + getId() + " ");
		System.out.print("従業員名：" + getName() + " ");
		System.out.println("担当地域名：" + this.area);
	}
}