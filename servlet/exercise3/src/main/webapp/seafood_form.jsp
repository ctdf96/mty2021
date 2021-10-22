<%@ page import="exercise3.Seafood" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang ="ja">
<head>
<meta charset="UTF-8">
<title>海産物購入フォーム</title>
<style>
	td{
		text-align : center;
		}
</style>
</head>

<body>
<div id = "wrapper">
<header><h1>海産物購入フォーム</h1></header>
<main>
<table border = "1">
<%for(int i = 0; i < Seafood.item.length; i++){ %>
<tr>
<td><%=Seafood.item[i] %></td>
<td><img src="img/<%=Seafood.image[i] %>" 	alt="<%=Seafood.item[i] %>"></td>
<td>\<%=Seafood.price[i] %></td>
<td><form action="form" method ="post">
<input type="submit" value="カートに入れる">
<input type="hidden" name="seafood" value="i">
</form></td>
</tr>
<% } %>
</table>

<p>
	<%=request.getAttribute("message") %>
</p>
<form action = "form" method = "post">

<p>
<input type ="submit" name = "clear" value="カートを空にする">
</p>
</form>

<p>
	<a href="cart">カートを確認する</a>
</p>
</main>
</div>
</body>
</html>