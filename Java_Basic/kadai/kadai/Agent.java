package kadai;

public class Agent {

	public static void main(String[] args) {
	Customer cstm1 = new Customer();
	cstm1.setCustNo(100);
	cstm1.setCustName("Michael");
	cstm1.getCustNo();
	cstm1.getCustName();
	System.out.println("Customer No.  : " + cstm1.getCustNo());
	System.out.println("Customer Name : " + cstm1.getCustName());
	}
}

class Customer{
	int custNo;//顧客番号
	String custName;//顧客名

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public int getCustNo() {
		return custNo;
	}
	
	public String getCustName() {
		return custName;
	}
}