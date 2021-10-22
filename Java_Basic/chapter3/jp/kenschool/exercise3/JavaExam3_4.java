package jp.kenschool.exercise3;

public class JavaExam3_4 {

	public static void main(String[] args) {			
		Calculator cal = new Calculator();
		int returnValue1 = cal.calc("100");
		int returnValue2 = cal.calc("100","5");
		System.out.println("引数が１つのメソッド" + returnValue1);
		System.out.println("引数が２つのメソッド" + returnValue2);
		}
	}
