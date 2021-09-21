<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
//リクエスト処理
request.setCharacterEncoding("UTF-8");
String getBirth = request.getParameter("birth");
String getGender = request.getParameter("gender");
String getColor = request.getParameter("color");
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
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
	background-color: <%=getColor%>
}
</style>
<title>様々なフォーム利用</title>
</head>
<body>
	<header>
		<h1>アンケート結果</h1>
	</header>
	<main>
		<p>
			<%=getBirth + getGender + "、趣味は" + strHobbies + "ですね。"%>
		</p>
		<p>ご協力、有難うございました。</p>
	</main>
</body>
</html>