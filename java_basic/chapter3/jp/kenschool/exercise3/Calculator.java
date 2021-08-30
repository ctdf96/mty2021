package jp.kenschool.exercise3;

public class Calculator {
	//引数１つ
	public int calc(String str) {
		int intNum = Integer.parseInt(str);
		intNum *= intNum;
		return intNum;
	}
	
//	引数２つ
	public int calc(String str1, String str2) {
		int intNum1 = Integer.parseInt(str1);
		int intNum2 = Integer.parseInt(str2);
		return (intNum1 * intNum2);
	}
}
