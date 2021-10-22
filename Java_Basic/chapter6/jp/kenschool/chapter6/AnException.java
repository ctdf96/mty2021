package jp.kenschool.chapter6;

public class AnException {

	public static void main(String[] args) {
		try {
		int[] test;
		test = new int[5];
		test[5]= 80;
		System.out.println("test[5]に80を代入");
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("配列の要素を超えています " + e);
//			e.printStackTrace();
			System.err.println("例外が発生したのでプログラムを終了します");
//			System.exit(-1);
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("例外が発生したのでプログラムを終了します");
			System.exit(-1);
		} finally {
		System.err.println("例外が発生したのでプログラムを終了します");
		}
		System.out.println("正常終了");
	}
}
