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
<h1>会員登録確認画面</h1>
<hr />
<div class ="info">${loginModel.loginId }でログイン中</div>
<hr />

<form:form>
<table>
<tr>
<td>会員氏名</td>
<td><c:out value="${memberModel.name }"/></td>
</tr>

<tr>
<td>性別</td>
<td>
<c:if test ="${memberModel.gender == 'man' }">男</c:if>
<c:if test ="${memberModel.gender == 'woman' }">女</c:if>
</td>
</tr>

<tr>
<td colspan ="2">
<p>${message }</p>
<input type ="submit" name="back" value="戻る"/>
<input type ="submit" name="forward" value="登録"/>

</td>
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