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
</style>
</head>

<body>
<h1>会員登録完了画面</h1>
<hr />
<div class ="info">${loginModel.loginId }でログイン中</div>
<hr />
<p>${message }</p>
<p><a href ="login">ログアウト</a></p>
<hr />
<p>
☆セッション情報確認☆<br/>
LoginModel => ${sessionScope.loginModel }<br/>
MemberModel => ${sessionScope.memberModel } </p>
</body>
</html>