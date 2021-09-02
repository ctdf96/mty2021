package jp.kenschool.exercise4;

public class CreateEmployee {
		
	public static void main(String[] args) {
		if(args.length == 0) {
			
			System.out.println("please input again.");
			System.exit(-1);} else {
		Employee emp1 = new Employee(Integer.parseInt(args[0]), args[1]);// 
		
		System.out.println("EmpNo  :"  + emp1.getEmpNo());			
		System.out.println("EmpName:" + emp1.getEmpName()) ;
		
	System.out.println();
	}
	}
}