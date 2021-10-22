package lambda;

public class AreaResultMain2 {
	@FunctionalInterface
	interface AreaResult{
	public double getCircleArea(int value);
	}

	public static void main(String[] args) {
	int num1 =15;
	AreaResult ar1 = (val) ->{
		return val * val * Math.PI;
	};
	double area = ar1.getCircleArea(num1);
	System.out.println("円の面積は"+Math.round(area) + "㎡です");
	}
}
