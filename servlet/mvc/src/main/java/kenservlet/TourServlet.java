package kenservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kenmodel.TourBean;

@WebServlet("/tour")
public class TourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ツアー情報を作成して変数tourにセットする
		request.setAttribute("tours", createTours());

		//top.jspに転送する
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/top.jsp");
		dispatcher.forward(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
			request.setCharacterEncoding("UTF-8");
			String btn = request.getParameter("btn");
			TourBean tour = null;
			HttpSession session = request.getSession(true); //セッションを事前に準備
			String jsp; //if文が実行されなかった場合にどこに行けばいいのかわからない場合は初期化

			if (btn.equals("選択")) { //もし「選択」ボタンが押されたら
				String tourId = request.getParameter("tourId"); //フォームからツアーIDを取得
				tour = searchTour (createTours(), tourId); //情報が足りないので/ツアーIDから商品情報を検索する
				session.setAttribute("tour",tour); //とってきた商品情報を持ち越すためsessionに保存
				jsp ="/number.jsp"; //転送先のJSP名を変数に代入

			} else if (btn.equals("試算")) {
				String adlut = request.getParameter("adlut");
				String child = request.getParameter("child");
				tour =(TourBean)session.getAttribute("tour");
				tour.setNumAdult(Integer.parseInt(adlut));
				tour.setNumAdult(Integer.parseInt(child));
				jsp = "/calc.jsp";
			} else {
				session.invalidate();
				request.setAttribute("tours", createTours());
				jsp = "/calc.jsp";
			}

			//JSPへの転送
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("jsp");
			dispatcher.forward(request, response);
		}

	private List<TourBean> createTours() {
		List<TourBean> tours = new ArrayList<>();

		TourBean tour = new TourBean();
		tour.setTourId("001");
		tour.setTourName("世界一透明な海でお魚さんと追いかけっこ");
		tour.setPlace("沖縄");
		tour.setPrice(53000);
		tours.add(tour);

		tour= new TourBean();
		tour.setTourId("002");
		tour.setTourName("くいだおれの街 大阪！日本の台所満喫ツアー");
		tour.setPlace("大阪");
		tour.setPrice(10000);
		tours.add(tour);

		tour= new TourBean();
		tour.setTourId("003");
		tour.setTourName("大牧場で自家製チーズ作り体験！");
		tour.setPlace("北海道");
		tour.setPrice(32000);
		tours.add(tour);

		return tours;
	}



	private TourBean searchTour(List<TourBean> tours, String tourId) {
		TourBean tour = null; //変数の初期化（１度も使われない場合に中身がない状態で戻されることを防ぐ）
		for (TourBean t : tours) {
			if (t.getTourId().equals(tourId)) {
				tour = t;
				break; // 見つかったらfor文を抜ける
			}
		}
		return tour;
	}
}