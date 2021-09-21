<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--宣言タグ--%>
    <%!
    	String method(){
    	return "<p>Hello World!!</p>";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スクリプティング要素</title>
</head>
<body>
<main>
<!-- HTMLコメント -->
<%--スクリプトレット --%>
<%
	String message = "JSP Scriptlet Elements";
%>
<%--式タグ --%>
<h1><%=message %></h1>
<%=method() %>
</main>
</body>
</html>