<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<title>Session サンプル</title>
<style>
.error{
	color :#ff0000;
	}

table{
border-spacing: 10px;
border-collapse : separate;
}
</style>
</head>
<body>
<h1>ログイン画面</h1>
<hr />

<form:form modelAttribute="loginModel">
<div class ="error">${errorMessage }</div>
<table>
<tr>
<td>ログインID</td>
<td><form:input path="loginId" /></td>
<td><form:errors path="loginId" element="div" cssClass="error" /></td>
</tr>
<tr>
<td>パスワード</td>
<td><form:password path="password"  /></td>
<td><form:errors path="password" element="div" cssClass="error" /></td>
</tr>

<tr>
<td colspan ="3">
<input type ="submit" value="ログイン"/></td>
</tr>
</table>
</form:form>
<hr />
<p>
☆セッション情報確認☆<br/>
LoginModel => ${sessionScope.loginModel }<br/>
MemberModel => ${sessionScope.memberModel } </p>
</body>
</html>