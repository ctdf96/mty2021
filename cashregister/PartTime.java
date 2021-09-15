package cashregister;

public class PartTime {
	
	private int prtNo;//従業員コード
	private String prtName;//名前
	private int empRank;//ランク（区分）

	//newするときに情報をすべて入れてオブジェクトを作りたいので、
	//フィールドにデータを設定するコンストラクタを作成しておく
	public PartTime(int empNo, String empName, int empRank) {
		this.prtNo = empNo;
		this.prtName = empName;
		this.empRank = empRank;
	}
		
	
	//mainに書く用
	//		アルバイト追加
	//		PartTime prt1 = new PartTime(3, "吉田", 1);
	//		PartTime prt2 = new PartTime(4, "田中", 1);
	//
	//		ArrayList<PartTime> prtArray = new ArrayList<>();
	//		prtArray.add(prt1);
	//		prtArray.add(prt2);
	
	
	
	//取得するメソッド(getter)と代入するメソッド(setter)を前もって作成しておく
	public int getEmpNo() {
		return prtNo;
	}

	public void setEmpNo(int empNo) {
		this.prtNo = empNo;
	}

	public String getEmpName() {
		return prtName;
	}

	public void setEmpName(String empName) {
		this.prtName = empName;
	}

	public int getEmpRank() {
		return empRank;
	}

	public void setEmpRank(int empRank) {
		this.empRank = empRank;
	}	
}
