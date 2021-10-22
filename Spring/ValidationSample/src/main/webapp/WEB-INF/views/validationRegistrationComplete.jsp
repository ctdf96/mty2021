<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="jp">
<head>
<meta charset="UTF-8">
<title>バリデーションの利用</title>
<style>

h1{
margin:0;
}
label{
 display: block;
}

.container{
	widht: 550px;
	margin:auto;
}

.errors{
color: red;
}
</style>
</head>
<body>
<div class="container">
<h1>会員登録完了</h1>
<p>氏名：${validationModel.name }</p>
<p>Email：${validationModel.email }</p>
<p>電話番号：${validationModel.phoneNumber }</p>
<p>誕生日：${validationModel.birthday }</p>
<p>ご登録いただき、ありがとうございました。</p>

</div>
</body>
</html>