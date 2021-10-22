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
<h1>会員登録</h1>
<form:form modelAttribute="validationModel">

<div>
<label>氏名</label>
<form:input path="name" size="20" />
<form:errors path="name" element="span" cssClass="errors" />
</div>

<div>
<label>Email</label>
<form:input path="email" size="30" />
<form:errors path="email" element="span" cssClass="errors" />
</div>


<div>
<label>電話番号（ハイフンなし・半角数字）</label>
<form:input path="phoneNumber" size="20" />
<form:errors path="phoneNumber" element="span" cssClass="errors" />
</div>

<div>
<label>誕生日（YYYY/MM/DD）</label>
<form:input path="birthday" size="15" />
<form:errors path="birthday" element="span" cssClass="errors" />
</div>

<div>
<p><input type="submit" value="登録する" /></p>
</div>
</form:form>
</div>
</body>
</html>