package lambda;

public class AreaResultMain {
	@FunctionalInterface
	interface AreaResult{
		public void getSquareArea(int value1, int value2);
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		AreaResult ar1 = (val1, val2) -> {
		int area = val1 * val2;
		System.out.println("四角形の面積は" + area + "㎡です");
			};
			ar1.getSquareArea(num1, num2);
	}

}
