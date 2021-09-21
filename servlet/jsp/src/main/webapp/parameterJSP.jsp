<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");
String parameter = request.getParameter("data");
parameter += "と入力しましたね。";%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザーからの入力を受け取る</title>
</head>
<body>
<header><h1>受け取った値の出力</h1></header>
<main>
<p><%=parameter  %></p></main>
</body>
</html>