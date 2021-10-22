package practice1;

public class Employee {
private int id;//従業員番号
private String name;//従業員名

public Employee(int id, String name) {//コンストラクタ
	this.id = id;
	this.name = name;
}

public int getId() {
	return this.id;
}

public String getName() {
	return this.name;
}

public void display() {
	System.out.println("従業員番号：" + this.id + " ");
	System.out.println("従業員名：" + this.name + " ");
}
}
