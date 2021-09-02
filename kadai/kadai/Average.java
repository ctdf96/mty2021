package kadai;

public class Average {
	public static void main(String[] args) {
		
		if(args.length == 3) {
			
		System.out.println("数学・国語・英語の点数を計算します。");
		double avg = (Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]))/3;
		System.out.println("数学の点数　："+args[0]);
		System.out.println("国語の点数　："+args[1]);
		System.out.println("英語の点数　："+args[2]);		
		System.out.println("３教科の平均点："+ avg);
		} else {
		System.out.println("引数のデータは３つ入力してください");
		System.exit(-1);
		}
	}
}