<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<title>会員マスタ　登録画面</title>
<style>
table {
    margin-left: auto;
    margin-right: auto;
}
span{
color :#ff0000;
}

.error{
	color :#ff0000;
	}
</style>
</head>
<body>
<h1 align="center">会員マスタ　登録画面</h1>
<form:form modelAttribute="memberModel">
<table>
<tr>
<td>会員ID <span>*必須</span></td>
<td><form:input path="memberId"  value="${memberModel.memberId }" size="3"/>
<form:errors path="memberId" element="div" cssClass="error" /></td>
</tr>

<tr>
<td>氏名 <span>*必須</span></td>
<td><form:input path="name"  value="${memberModel.name }" size="7"/>
<form:errors path="name" element="div" cssClass="error" /></td>
</tr>

<tr>
<td>性別</td>
<td>
<form:radiobutton  path="gender"  label="男" value="man"/>
<form:radiobutton  path="gender"  label="女" value="woman"/>
</td>
</tr>

<tr>
<td>生年月日（YYYY/MM/DD）</td>
<td><form:input path="age"  value="${memberModel.age }" size="7"/>
<form:errors path="age" element="div" cssClass="error" /></td>
</tr>

<tr>
<td>住所</td>
<td><form:input path="address"  value="${memberModel.address }" size="30"/></td>
</tr>
</table>
<p>
<center><input type ="submit" value="送信"/></center>

</form:form>
<p>


</body>

</html>