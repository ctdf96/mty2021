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

import kenservice.AgeSearch;
import kenservice.IdSearch;

/**
 * Servlet implementation class IdSearch
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエスト処理
		request.setAttribute("message", "検索条件を入力してください。");

		//転送処理
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/disp.jsp");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエスト処理
		request.setCharacterEncoding("UTF-8");
		String searchBtn =  request.getParameter("btn"); //押されたボタン情報
		String jsp;

		try {
			//従業員ID検索の場合
			if (searchBtn !=null && searchBtn.equals("IdSearch")) {
				IdSearch ids = new IdSearch();
				ids.execute(request);
				jsp = "/disp.jsp";
			}
			//年齢検索の場合
			else if (searchBtn !=null && searchBtn.equals("AgeSearch")) {
				AgeSearch ages = new AgeSearch();
				ages.execute(request);
				jsp = "/disp.jsp";

			} else {
				request.setAttribute("errorMessage", "不正アクセスです");
				request.setAttribute("backAddress", "controller");
				jsp = "/error.jsp";
			}

			} catch (NumberFormatException e) {
				e.printStackTrace();
				request.setAttribute("errorMessage", "数値を入力してください");
				request.setAttribute("backAddress", "controller");
				jsp = "/error.jsp";

			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("errorMessage", "JDBCのエラーです");
				request.setAttribute("backAddress", "controller");
				jsp = "/error.jsp";

			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("errorMessage", "エラーが発生しました");
				request.setAttribute("backAddress", "controller");
				jsp = "/error.jsp";
			}

		//転送処理
				ServletContext context = getServletContext();
				RequestDispatcher rd = context.getRequestDispatcher(jsp);
				rd.forward(request, response);
	}
}
