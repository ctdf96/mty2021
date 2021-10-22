package kadai;

public class MaxValue {

	public static void main(String[] args) {
		int max = 0;
		
		if(args.length == 0) {
			
			System.out.println("please input one number.");
			System.exit(-1);
			} else {
		
				for(int i = 0; i < args.length ;i++) {
		if( max < Integer.parseInt(args[i])) { 
			max = Integer.parseInt(args[i]);
			}
		}

		System.out.println("最大値は" + max + "です");	
		}
	}
}

