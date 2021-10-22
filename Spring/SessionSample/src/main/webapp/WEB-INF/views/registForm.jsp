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
.info{
	color :#0000ff;
	}
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
<h1>会員登録画面</h1>
<hr />
<div class ="info">${loginModel.loginId }でログイン中</div>
<hr />

<form:form modelAttribute="memberModel">
<table>
<tr>
<td>会員氏名</td>
<td><form:input path="name"  value="${memberModel.name }"/></td>
<td><form:errors path="name" element="div" cssClass="error" /></td>
</tr>

<tr>
<td>性別</td>
<td>
<form:radiobutton  path="gender"  label="男" value="man"/>
<form:radiobutton  path="gender"  label="女" value="woman"/>
</td>
</tr>

<tr>
<td>メールアドレス</td>
<td><form:input path="mail"  value="${memberModel.mail }"/></td>
<td><form:errors path="mail" element="div" cssClass="error" /></td>
</tr>

<tr>
<td colspan ="3">
<input type ="submit" value="確認"/></td>
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