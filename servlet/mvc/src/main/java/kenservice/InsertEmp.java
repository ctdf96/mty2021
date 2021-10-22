package kenservice;

import javax.servlet.http.HttpServletRequest;

import kendao.EmpDao;
import kenmodel.EmpBean;

public class InsertEmp {
	public void execute(HttpServletRequest request) throws Exception{
		EmpDao dao = null;
	//従業員情報をリクエストパラメーターから取得
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String mail = request.getParameter("email");
		try {
			if (name != null && !name.isEmpty()
					&& address != null && !address.isEmpty()
							&& age != null && !age.isEmpty()
									&& mail != null && !mail.isEmpty()) {
			EmpBean emp = new EmpBean();
			emp.setName(name);
			emp.setAddress(address);
			emp.setAge(Integer.parseInt(age));
			emp.setMail(mail);
			dao = new EmpDao();
			int numRow = dao.insertEmpData(emp);
			if (numRow > 0){
				request.setAttribute("message","従業員情報を登録しました");
			} else {
				request.setAttribute("message", "従業員情報を登録できませんでした");
			}
			} else {
				request.setAttribute("message", "従業員情報に未入力欄があるため、登録できません");
			}
		} finally {
			if(dao != null) {
				dao.close();
			}
		}
	}
}