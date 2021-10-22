package kadai;

class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee(1001,"山田太郎","開発部","3101");
		int id = emp.getId();
		String name = emp.getName();
		String dept = emp.getDept();
		String tel = emp.getTel();
		System.out.println("ID  : " + id);
		System.out.println("名前: " + name);
		System.out.println("所属: " + dept);
		System.out.println("内線: " + tel);
	}

}

class Employee {
	int id; //社員ID
	String name;//社員名
	String dept;//所属名
	String tel;//内線番号
	
	public Employee(int id, String name, String dept, String tel) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public String getTel() {
		return tel;
	}	
}