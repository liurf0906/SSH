<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="login.action" method="post">
		<input name="uname" />	
		<input type="password" name="upwd" />
		<input type="submit" value="登录" />
		<input type="button" value="注册" onclick="window.location.href = 'UserAdd.jsp'" />
	</form>
</body>
</html>