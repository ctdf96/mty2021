package excercise1_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcerciseServlet2
 */
@WebServlet("/excercise2")
public class ExcerciseServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ヘッダー情報の確認
		//不正なページからアクセスがあった場合
		String url ="http://localhost:8080/excercise1_2/excercise_page2.html";
		String referer = request.getHeader("Referer");
		if(referer == null || !referer.equals(url)) {
			response.setStatus(HttpServletResponse.SC_FOUND);
			response.setHeader("Location", url);
			System.out.println("リダイレクトしました");
			return;
		}

		// 正しいページからアクセスがあった場合
		request.setCharacterEncoding("UTF-8");//文字化けを防ぐ
		String param1 = request.getParameter("value1");
		String param2 =request.getParameter("value2");

		//結果をHTMLに表示する
		String disp = null;

		try {
		int num1 = Integer.parseInt(request.getParameter("value1"));
		int num2  = Integer.parseInt(request.getParameter("value2"));

		if (param1 != null ||  param2 !=null ) {//パラメーターが存在するかのチェック
				if( !param1.isEmpty() || param2.length() != 0){//未入力チェック
					disp = param1 + "足す" + param2 + "は" +(num1 + num2) +"です。";
				}
			}}
	catch(NumberFormatException e){
		disp ="値が不正です。数値を入力してください。";
		}

		 if(param1.isEmpty()||param2.isEmpty()){
				disp ="両方のテキストボックスに値を入れて下さい。";
				}

		//レスポンス処理
		response.setContentType("text/html; charset=UTF-8");//文字化けを防ぐ
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"ja\">");
		out.println("<head>");
		out.println("<meta charset =\"UTF-8\">");
		out.println("<title>計算結果を表示</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<header><h1>計算結果を表示</h1></header>");
		out.println("<main>");
		out.println("<hr>");
		out.println("<p>" + disp + "</p>");
		out.println("</main>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
