package jp.kenschool.exercise4;

class Employee {
		int empNo;//社員番号
		String empName;//社員名
		
		public Employee(int empNo, String empName) {//コンストラクタ
			this.empNo = empNo;
			this.empName = empName;
		}

		int getEmpNo() {
			return empNo;
		}
		
		String getEmpName() {
			return empName;
		}
	}
