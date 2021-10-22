package jp.kenschool.exercise4;

public class JavaExam4_3 {

	public static void main(String[] args) {
		AbstractPlayer[] array = { new ExDVDPlayer(),new ExCDPlayer()};
		
	for(AbstractPlayer player: array) {
		player.play();
		player.stop();
		player.electrify();
		}
	}

}
