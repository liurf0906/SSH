<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>用户注册</h1>
	<s:form action="save.action" method="post" enctype="multipart/form-data">
		<input type="text" name="uname" />
		<s:select list="{'君主','武将'}" name="role.rname"></s:select>
		<s:file name="photo"></s:file>
		<input type="submit" value="提交" />
	</s:form>
</body>
</html>