<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html lang ="ja">
<head>
<meta charset="UTF-8">
<title>従業員削除ページ</title>
</head>

<body>
<header><h1>従業員削除ページ</h1></header>
<main>

<c:if test ="${not empty confirmMessage }">
<p class ="message"><c:out value ="${confirmMessage }"/></p>
<form action ="delete" method="post">
	<p>
		<input type ="hidden" name ="empId" value ="${param.empId}">
		<input type ="submit" value ="削除">
	</p></form>
</c:if>

<c:if test ="${not empty completeMessage }">
<p class ="message"><c:out value ="${completeMessage }"/></p>
</c:if>

<p><a href ="controller">従業員検索ページへ</a></p>
</main>
</body>
</html>