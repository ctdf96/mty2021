<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="jp">
<head>

<meta charset="UTF-8">
<title>課題① 社員管理マスター登録画面</title>
<link rel = "stylesheet" href = "/employees/resources/styles.css">
</head>

<body>
<div class = "container">
<header><h1>社員管理マスター登録画面</h1></header>
<main>
<form:form modelAttribute="employeeModel">

<table>
<tr>
<td>氏名</td>
<td><form:input path="name" size="25" />
<form:errors path="name" element="div" cssClass="errors" /></td>
</tr>

<tr>
<td>フリガナ</td>
<td><form:input path="kana" size="25" />
<form:errors path="kana" element="div" cssClass="errors" /></td>
</tr>

<tr>
<td>性別</td>
<td><form:radiobutton path="gender"  label ="男" value="man" checked ="true" />
<form:radiobutton path="gender"  label ="女" value="woman"  /></td></tr>

<tr>
<td>生年月日</td>
<td><form:select path="birthYear"  items="${birthYear }"  itemLabel="label" itemValue ="data" />&nbsp;年
<form:select path="birthMonth"  items="${birthMonth }"  itemLabel="label" itemValue ="data" />&nbsp;月
<form:select path="birthDay"  items="${birthDay }"  itemLabel="label" itemValue ="data" />&nbsp;日</td></tr>

<tr><td>郵便番号</td>
<td><form:input path="zip" size="8" /><br>
<form:errors path="zip" element="span" cssClass="errors" />
</td></tr>

<tr><td>住所</td>
<td><form:input path="address" size="50" /><br>
<form:errors path="address" element="span" cssClass="errors" /></td></tr>

<tr><td>携帯番号</td>
<td><form:input path="phone" size="15" /><br>
<form:errors path="phone" element="span" cssClass="errors" /></td></tr>

<tr><td>メールアドレス</td>
<td><form:input path="mail" size="25" /><br>
<form:errors path="mail" element="span" cssClass="errors" /></td></tr>

<tr>
<td>入社年月日</td>
<td><form:select path="empYear"  items="${empYear }"  itemLabel="label" itemValue ="data" />&nbsp;年
<form:select path="empMonth"  items="${empMonth }"  itemLabel="label" itemValue ="data" />&nbsp;月
<form:select path="empDay"  items="${empDay }"  itemLabel="label" itemValue ="data" />&nbsp;日
</td>
</tr>

<tr><td>部署</td>
<td><form:select path ="post"  items="${postMap }" multiple ="false"/></td></tr>

<tr><td>保有資格</td>
<td><form:checkboxes  path="capacities"  items="${capacitiesMap}" delimiter="<br />" />
</td></tr>

<tr><td colspan ="2" style ="text-align:center;">
<input type = "submit" value="確認" /></td></tr>

</table>
</form:form>
</main>

<footer>
	<div class = "copyrignt">
	<small>&copy; KENスクール</small>
	</div>
</footer>

</div>
</body>
</html>