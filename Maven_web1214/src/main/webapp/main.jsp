<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="800">
		<caption>用户管理</caption>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>照片</th>
			<th>角色名称</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<s:iterator value="users" status="i">
			<tr>
				<th><s:property value="#i.count" /></th>
				<th><s:property value="uname" /></th>
				<th><img width="100" height="75" alt="" src="upload/<s:property value="uphoto" />"></th>
				<th><s:property value="role.rname" /></th>
				<th>
					<a href="update.action?uid=<s:property value="uid" />">修改</a>
				</th>
				<th>
					<a href="delete.action?uid=<s:property value="uid" />">删除</a>
				</th>
			</tr>
		</s:iterator>
	</table>
	<a href="UserAdd.jsp">添加角色</a>
</body>
</html>