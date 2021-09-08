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
