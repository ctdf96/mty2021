package jp.kenschool.chapter4;

public class InterfaceMain {

	public static void main(String[] args) {
	 System.out.println(Button.size);
	 
	 Button btn = new Save();
	 btn.push();
	 
	 Button btn2 = new Close();
	 btn2.push();
	 }
	}
