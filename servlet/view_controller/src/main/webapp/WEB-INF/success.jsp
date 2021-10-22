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
<jsp:include page = "header.jsp"/>

	<h1>数当てゲーム</h1>
	<p><%=request.getAttribute("message") %></p>

<main>
 <a href = "numbersGame">はじめから</a>
</main>
<%@include file = "../footer.html" %>
</body>
</html>