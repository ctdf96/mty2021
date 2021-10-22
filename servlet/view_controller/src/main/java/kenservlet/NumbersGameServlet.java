package kenservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NumbersGameServlet
 */
@WebServlet("/numbersGame")
public class NumbersGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// セッションオブジェクトの取得
		HttpSession session = request.getSession(true);
		// セッションに登録された正解の数
		Integer number = (Integer)session.getAttribute("number");
		//解答した回数
		Integer count = (Integer)session.getAttribute("count");

		if (number == null) {
			//乱数を使用して1～99の数をセッションオブジェクトに登録
			number = (int)(Math.random() * 99 + 1);
			session.setAttribute("number", number);
			}

		if (count == null) {
			count = 0;
			session.setAttribute("count", count);
			}

		request.setAttribute("message","1から99までの数値を入力してください。");

		//JSPへの転送
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/numbersGame.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメーターの値
		String param = request.getParameter("paramNum");
		String jsp = null;
		String message = null;

		if (param != null && !param.isEmpty()) {
			try {
				//リクエストパラメーターの値（integerオブジェクトに変換）
				Integer paramNum = new Integer(param);

				// セッションオブジェクトの取得
				HttpSession session = request.getSession(false);

				//解答した回数
				Integer count = (Integer)session.getAttribute("count");
				count++;
				session.setAttribute("count", count);

				//セッションに登録された正解の数
				Integer number = (Integer)session.getAttribute("number");

				if (paramNum.equals(number)) {
					message = count + "回目で正解、" + number + "でした";
					jsp = "/WEB-INF/success.jsp";
					session.invalidate();
				} else {
					message = count + "回目の不正解！！";
					jsp = "/WEB-INF/numbersGame.jsp";
					}
			}catch (NumberFormatException e) {//数値以外が入力されたとき
				message = "数値を入力してください。";
				jsp = "/WEB-INF/error.jsp";
			} catch(NullPointerException e) {//セッションが無効の場合
				message = "はじめからやり直してください";
				jsp = "/WEB-INF/error.jsp";
			}
			} else {
				message = "1から99までの数値を入力して下さい。";
				jsp = "/WEB-INF/numbersGame.jsp";
			}
		request.setAttribute("message", message);

		//JSPへの転送
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
		}
	}