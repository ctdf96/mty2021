package cashregister;

public class Manager {
		private int mngNo;//従業員コード
		private String mngName;//名前
		private int empRank;//ランク（区分）

		//newするときに情報をすべて入れてオブジェクトを作りたいので、
		//フィールドにデータを設定するコンストラクタを作成しておく
		public Manager(int empNo, String empName, int empRank) {
			this.mngNo = empNo;
			this.mngName = empName;
			this.empRank = empRank;
		}
			
			
		//取得するメソッド(getter)と代入するメソッド(setter)を前もって作成しておく
		public int getEmpNo() {
			return mngNo;
		}

		public void setEmpNo(int empNo) {
			this.mngNo = empNo;
		}

		public String getEmpName() {
			return mngName;
		}

		public void setEmpName(String empName) {
			this.mngName = empName;
		}

		public int getEmpRank() {
			return empRank;
		}

		public void setEmpRank(int empRank) {
			this.empRank = empRank;
		}	
	}