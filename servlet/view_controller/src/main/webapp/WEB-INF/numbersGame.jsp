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
<main>
<form action ="numbersGame" method = "post">
<input type = "text" name = "paramNum">
<input type = "submit" value = "answer">
</form>
</main>
<%@include file = "../footer.html" %>
</body>
</html>