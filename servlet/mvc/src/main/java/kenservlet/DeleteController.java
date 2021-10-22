package kenservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kenservice.DeleteEmp;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		//リクエスト処理
    		request.setCharacterEncoding("UTF-8");
    		String empId = request.getParameter("empId");
    		String jsp;

    		try {
				//転送処理
    			request.setAttribute("confirmMessage", "ID : " + empId + " を削除しますか？");
    			jsp = "/delete.jsp";
			} catch (NumberFormatException e) {
				request.setAttribute("errorMessage", "不正な操作です");
				jsp = "/error.jsp";
			}
    		//転送処理
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher(jsp);
			rd.forward(request, response);
    	}

    	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		//リクエスト処理
    		request.setCharacterEncoding("UTF-8");
    		String jsp;

    		try {
    			//従業員削除の場合
    				DeleteEmp delete = new DeleteEmp();
    				delete.execute(request);
    				jsp = "/delete.jsp";

    			} catch (NumberFormatException e) {
    				request.setAttribute("errorMessage", "削除するIDが不正です");
    				jsp = "/error.jsp";

    			} catch (SQLException e) {
    				e.printStackTrace();
    				request.setAttribute("errorMessage", "JDBCのエラーです");
    				request.setAttribute("backAddress", "insert");
    				jsp = "/error.jsp";

    			} catch (Exception e) {
    				e.printStackTrace();
    				request.setAttribute("errorMessage", "エラーが発生しました");
    				jsp = "/error.jsp";
    			}

    		//転送処理
    				ServletContext context = getServletContext();
    				RequestDispatcher rd = context.getRequestDispatcher(jsp);
    				rd.forward(request, response);
    	}
    }