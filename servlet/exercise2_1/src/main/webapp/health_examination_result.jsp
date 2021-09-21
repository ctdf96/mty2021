<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String[] get_health = request.getParameterValues("health");

    int count = 0;
    String result;

    if(name != null){//パラメーターがない＝不正アクセス
    		if(get_health == null){//チェックがない（null）と長さの値が返らない（０個としてカウントされない）
    			count =0;//０が入らないので代入する
    			} else {
    				count = get_health.length;//名前が未入力でもカウントする
    			}

    	if(!name.isEmpty()){
    		switch (count){
    		case 0:
    			result = "非常に健康です";
    			break;

			case 1:
        		result = "健康です";
        		break;

			case 2:
    			result = "健康に気を使いましょう";
    			break;

			case 3:
    			result = "不健康です";
    			break;

			case 4:
    			result = "一度検査を受けてみては？？";
    			break;

			default:
    			result = "エラー";
    			break;
    		}
    	} else {
    		name = "名無し";
    		result ="お名前を入力して下さい。";
    	}
    } else {
    		name = "測定不能";//直接アクセスした場合→パラメーターがない
    		result ="トップページに戻って下さい。";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康チェック結果ページ</title>
</head>
<body>
	<header>
		<h1>健康チェック結果</h1>
	</header>
	<main>
		<h2>
			<%=name%>さんの健康チェック</h2>
			<p>チェックは<%=count %>個です</p>
			<p>結果：<%=result %></p>
			<p><a href="health_examination.html">戻る</a></p>
			</main>
</body>
</html>