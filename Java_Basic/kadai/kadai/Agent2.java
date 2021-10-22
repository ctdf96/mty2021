package kadai;

public class Agent2 {

	public static void main(String[] args) {
	Customer2 cst1 = new Customer2(200, "KEN");
	cst1.getCustNo();
	cst1.getCustName();
	System.out.println("Customer No.  : " + cst1.getCustNo());
	System.out.println("Customer Name : " + cst1.getCustName());
	}

}

class Customer2{
	int custNo;//顧客番号
	String custName;//顧客名
	
	public Customer2(int custNo, String custName) {
		this.custNo = custNo;
		this.custName = custName;
	}
	
	public String getCustName() {
		return custName;
	}

	public int getCustNo() {
		return custNo;
	}
}
