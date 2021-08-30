
public class UseClassCode {

	public static void main(String[] args) {
		
		Student[] students = { 
				new Student("鈴木一郎",'男',45), 
				new Student("山田花子",'女',90), 
				new Student("田中次郎",'男',70)
				};
		
//		students[0].input("鈴木一郎",'男',45);
//		students[1].input("山田花子",'女',90);
//		students[2].input("田中次郎",'男',70);

		for (Student student : students) {
			student.disp();
		}
	}
}
