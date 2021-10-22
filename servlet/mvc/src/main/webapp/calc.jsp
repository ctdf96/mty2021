<%@ page import="kenmodel.TourBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
TourBean tour = (TourBean) session.getAttribute("tour");
%>

<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="tour.css">
<title>ツアー試算ページ</title>
</head>

<body>
	<header>
		<h1>ツアー試算結果</h1>
	</header>


	<main>
		<section>
			<h2>お選びになったツアー</h2>
			<table border="1">
				<tr class="yellow">
					<td class="col1">ツアーID</td>
					<td class="col2">ツアー名</td>
					<td class="col3">行き先</td>
					<td class="col4">料金</td>
				</tr>

				<tr>
					<td>${sessionScope.tour.tourId }</td>
					<td>${sessionScope.tour.tourName }</td>
					<td>${sessionScope.tour.palce }</td>
					<td>大人 ￥${sessionScope.tour.price }</td>
				</tr>
			</table>
		</section>

		<section>
			<h2>試算</h2>
			<p class="marginLeft">
				大人：${sessionScope.tour.numAdult }名<br>
				子供：${sessionScope.tour.numChild }名
			</p>
			<h3>計： ￥${sessionScope.tour.totalAmount() }</h3>
			<%
			if (tour.getNumPeople() >= 4) {
			%>
			<p class="discount">
			${sessionScope.tour.numPeople }名様で、
				グループ割引適用、1割引！！</p>
			<%
			}
			%>
			<form action="tour" method="post">
				<p>
					<input type="submit" name="btn" value="トップへ戻る">
				</p>
			</form>
		</section>
	</main>
</body>
</html>