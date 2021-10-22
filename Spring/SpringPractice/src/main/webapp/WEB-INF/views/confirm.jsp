<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<title>練習問題</title>
<style>
table {
    margin-left: auto;
    margin-right: auto;
}
</style>
</head>

<body>
<div>
<h1 align="center">会員マスタ　確認画面</h1></div>

<form:form>
<table>
<tr>
<td>会員ID</td><td><c:out value="${memberModel.memberId }"/></td>
</tr>

<tr>
<td>氏名</td><td><c:out value="${memberModel.name }"/></td>
</tr>

<tr>
<td>性別</td>
<td><c:if test ="${memberModel.gender == 'man' }">男</c:if>
<c:if test ="${memberModel.gender == 'woman' }">女</c:if>
</td>
</tr>

<tr>
<td>生年月日</td><td><c:out value="${memberModel.age }"/> （歳）</td>
</tr>

<tr>
<td>住所</td><td><c:out value="${memberModel.address }"/></td>
</tr>
</table>
<p>
<center>
<input type ="submit" name="back" value="戻る"/>
<input type ="submit" name="forward" value="登録"/></center>
</form:form>
</body>
</html>