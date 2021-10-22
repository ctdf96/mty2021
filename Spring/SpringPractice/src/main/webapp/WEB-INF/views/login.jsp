<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<title>会員管理システム</title>
<style>
table {
    margin-left: auto;
    margin-right: auto;
}
.error{
	color :#ff0000;
	}
</style>
</head>

<body>
<h1>会員管理システム</h1>


<input type ="submit" value="ログイン"/>


<table>
<tr>
<td>ユーザー名　　　</td>

</tr>
<tr>
<td>パスワード　　　</td>

</tr>
<tr><td class ="error">${errorMessage }</td></tr>
<tr>

<td></td>
</tr>
</table>

</body>
</html>