<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ja">
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "../style.css">
<title>数当てゲーム</title>
</head>
<body>
<%@include file = "../footer.html" %>

	<h1>数当てゲーム</h1>
	<p><%=request.getAttribute("message") %></p>

<main>
 <a href = "numbersGame">ゲームを続ける</a>
</main>
<%@include file = "../footer.html" %>
</body>
</html>