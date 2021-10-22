<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html lang ="ja">
<head>
<meta charset="UTF-8">
<title>従業員新規登録ページ</title>
</head>

<body>
<header><h1>従業員新規登録ページ</h1></header>
<main>
<p class ="message"><c:out value ="${message }"/></p>
<form action ="insert" method="post">
<table border="1">
<tr>
<td>名前</td>
<td><input type ="text" name ="name"></td>
</tr>
<tr>
<td>住所</td>
<td><input type ="text" name ="address"></td>
</tr>
<tr>
<td>年齢</td>
<td><input type ="text" name ="age"></td>
</tr>
<tr>
<td>E-MAIL</td>
<td><input type ="text" name ="email"></td>
</tr>

<tr>
<td colspan="2" align = "center">
<input type = "hidden" name = "btn" value = "InsertEmp">
<input type ="submit" value= "登録">
</td>
</tr>
</table>
</form>
<p><a href ="controller">従業員検索ページへ</a></p>
</main>
</body>
</html>