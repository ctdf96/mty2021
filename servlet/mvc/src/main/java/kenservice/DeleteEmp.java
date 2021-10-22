package kenservice;

import javax.servlet.http.HttpServletRequest;

import kendao.EmpDao;

public class DeleteEmp {
		public void execute(HttpServletRequest request) throws Exception {
			EmpDao daoDel = null;
			//従業員情報をリクエストパラメータから取得
			String empId = request.getParameter("empId");

			try {
				if (empId != null) {
					daoDel = new EmpDao();
					int numRow = daoDel.deleteEmpData(Integer.parseInt(empId));

							if (numRow > 0) {
								request.setAttribute("completeMessage","従業員情報を削除しました");
							} else {
								request.setAttribute("completeMessage", "従業員情報を削除できませんでした");
							}
						} else {
								request.setAttribute("confirmMessage", "不正アクセスです");
							}
						} finally {
							if(daoDel != null) {
								daoDel.close();
							}
						}
					}
				}