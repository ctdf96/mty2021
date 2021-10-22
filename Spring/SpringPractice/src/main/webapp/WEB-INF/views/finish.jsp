<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="jp">
<head>
	<title>Home</title>
</head>
<body>
<div align="right">ユーザー名：${memberModel.name }<br>
<a href="/practice">ログアウト</a></div>
<h1>
	会員マスタ　●●画面
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>