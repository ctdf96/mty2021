package kenservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputOutputServlet
 */
@WebServlet("/inputoutput")//URLマッピングで変更した場所
public class InputOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ヘッダー情報の確認
		String url ="http://localhost:8080/servlet/input.html";
		String referer = request.getHeader("Referer");
		if(referer == null || !referer.equals(url)) {
			response.setStatus(HttpServletResponse.SC_FOUND);
			response.setHeader("Location", url);
			System.out.println("リダイレクトしました");
			return;
		}

		// リクエスト処理
		request.setCharacterEncoding("UTF-8");//文字化けを防ぐ
		String data = request.getParameter("data");
		String message ="入力してください。";
		if(data != null && !data.isEmpty()) {
			message ="doGet()メソッドが動かしました。<br>"
					+ data + "を入力しましたね。";
		}

		//レスポンス処理
		response.setContentType("text/html; charset=UTF-8");//文字化けを防ぐ
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"ja\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>Servlet InputOutput</title>");
		out.println("</head>");
		out.println("<main>");
		out.println("<h1>" + message + "</h1>");
		out.println("<a href=\"input.html\">戻る</a>");
		out.println("</main>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエスト処理
		request.setCharacterEncoding("UTF-8");//文字化けを防ぐ
		String data = request.getParameter("data");
		String message ="入力してください。";
		if(data != null && !data.isEmpty()) {
			message ="doPost()メソッドが動かしました。<br>"
					+ data + "を入力しましたね。";
		}

		//レスポンス処理
		response.setContentType("text/html; charset=UTF-8");//文字化けを防ぐ
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"ja\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>Servlet InputOutput</title>");
		out.println("</head>");
		out.println("<main>");
		out.println("<h1>" + message + "</h1>");
		out.println("<a href=\"input.html\">戻る</a>");
		out.println("</main>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
