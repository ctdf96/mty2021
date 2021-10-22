<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="jp">
<head>

<meta charset="UTF-8">
<title>課題① 社員管理マスター登録確認画面</title>
<link rel = "stylesheet" href = "/employees/resources/styles.css">
</head>

<body>
<div class ="container">
<header>
<h1>社員管理マスター登録確認画面</h1>
</header>

<main>
<form:form method = "GET">

<table>
<tr>
<td>氏名</td>
<td>${employeeModel.name}</td>
</tr>
<tr>
<td>フリガナ</td>
<td>${employeeModel.kana}</td>
</tr>
<tr>
<td>性別</td>
<td>${gender}</td></tr>

<tr><td>生年月日</td>
<td>${employeeModel.birthYear}年&nbsp;
${employeeModel.birthMonth}月&nbsp;
${employeeModel.birthDay}日</td></tr>

<tr><td>郵便番号</td>
<td>${employeeModel.zip}</td></tr>

<tr><td>住所</td>
<td>${employeeModel.address}</td></tr>

<tr><td>携帯番号</td>
<td>${employeeModel.phone}</td></tr>

<tr><td>メールアドレス</td>
<td>${employeeModel.mail}</td></tr>

<tr><td>入社年月日</td>
<td>${employeeModel.empYear}年&nbsp;
${employeeModel.empMonth}月&nbsp;
${employeeModel.empDay}日</td></tr>

<tr><td>部署</td>
<td>${post}</td></tr>

<tr><td>保有資格</td>
<td>${capacities}</td></tr>

<tr><td colspan ="2" style ="text-align:center;">
<input type ="submit" value="登録" />
</td></tr>
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