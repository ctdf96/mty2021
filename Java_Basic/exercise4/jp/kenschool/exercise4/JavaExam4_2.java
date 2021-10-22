package jp.kenschool.exercise4;

public class JavaExam4_2 {

	public static void main(String[] args) {
	IPlayer player ;
	player = new CDPlayer();
//	CDPlayer cd = new CDPlayer();
//	player = cd;
	player.play();
	
	player = new DVDPlayer();
	player.play();
	}
}
