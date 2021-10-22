package jp.kenschool.chapter6;
import java.util.Scanner;

public class ThrowsTest {
	
 public static void main(String[] args) throws Exception {
	
	//入力した数値を表示する
	int num = input();
	System.out.println( num + "が入力されました");
	}

public static int input() throws Exception {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("数値を入力してください");
	int num;
	num = sc.nextInt();
	
	return num;
}

}
