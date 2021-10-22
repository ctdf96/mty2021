package lambda;

public class ObscuritySampleMain {

	public static void main(String[] args) {
		SampleRun sr = new SampleRun() {
		public void run() {
			for(int i = 1 ; i <=5 ; i++) {
				System.out.println("i : " + i);
			}
	}
};
 	sr.run();
	}
}