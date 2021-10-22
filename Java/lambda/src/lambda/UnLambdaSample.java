package lambda;

public class UnLambdaSample implements SampleRun {

	@Override
	public void run() {
		for(int i = 1 ; i <=5 ; i++) {
			System.out.println("i : " + i);
	}
 }
}