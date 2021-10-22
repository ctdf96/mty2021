<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8" >
<!-- Required meta tags -->

    <meta name="viewport" content="width=device-width, initial-scale=1">

	<title>会員管理システム</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<style>
.container{
	background-color: #EEEFFF;
}</style>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<h1 class="text-primary fs-4 mx-auto col-4 my-4 text-center">会員管理システム</h1>

<div class="row g-3 mx-auto">
  <div class="col-auto"> <label for="user" class="col-form-label">ユーザー名</label>
  </div>

  <div class="col-auto">
    <input type="text" id="user" class="form-control" >
  </div>

<div class="row">
	  <div class="col-auto">
	    <label for="password" class="col-form-label">パスワード</label>
</div>

	  <div class="col-auto">
	    <input type="password" id="password" class="form-control" >
	  </div>

<p class ="error">${errorMessage }</p>

	<div class ="row">
		<div class ="col-2" ></div>
		<div class ="col-3 mx-auto"><input type="submit" value="ログイン" class="btn btn-primary form-control"></div>
		<div class ="col-2"></div>
	</div>

</body>
</html>