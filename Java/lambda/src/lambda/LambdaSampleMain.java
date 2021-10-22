package lambda;

public class LambdaSampleMain {

	public static void main(String[] args) {
		SampleRun sr = () -> {
			for(int i = 1 ; i <=5 ; i++) {
				System.out.println("i : " + i);
			}
		};
	 	sr.run();
	}
}
