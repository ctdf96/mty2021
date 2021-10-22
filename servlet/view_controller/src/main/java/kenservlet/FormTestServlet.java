package kenservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormTestServlet
 */
@WebServlet("/formtest")
public class FormTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSPへの転送
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/formtest1.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエスト処理
		request.setCharacterEncoding("UTF-8");
		String getBirth = request.getParameter("birth");
		String getGender = request.getParameter("gender");
		String[] getHobbies = request.getParameterValues("hobby");
		String strHobbies;
		if (getHobbies != null) {
			strHobbies = "";
			for (String hobby : getHobbies) {
				strHobbies += hobby + "、";
			}
		} else {
			strHobbies = "その他";
		}

			String message  = getBirth + getGender + "、趣味は" + strHobbies + "ですね。";
			request.setAttribute("message", message);

			//JSPへの転送
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/formtest2.jsp");
			dispatcher.forward(request, response);
	}
}