package kenservlet;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエスト処理
		String message = "お名前を入力して「Cookieを発行」を押してください。";
		String cookieValue = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("cname")) {
					cookieValue = URLDecoder.decode(cookie.getValue(), "UTF-8");
					message = "再度、お名前を入力して「Cookieを発行」を押すと、新しい名前を登録できます。";
				}
			}
		}
		request.setAttribute("message", message);
		request.setAttribute("cookieValue", cookieValue);

		//JSPへの転送
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/getcookie.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエスト処理
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String message;
		if (name != null && !name.isEmpty()) {
			String encName = URLEncoder.encode(name,"UTF-8");
			Cookie cookie = new Cookie("cname", encName);
			cookie.setMaxAge(60 * 60 * 24 * 7);
			response.addCookie(cookie);
			message = "戻って確認してください。";
		} else {
			name = null;
			message = "戻ってお名前を入力してください。";
		}

		request.setAttribute("name", name);
		request.setAttribute("message", message);

		//JSPへの転送
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/postcookie.jsp");
		dispatcher.forward(request, response);
	}
}
