<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="li">
	<tr>
		<td>${li.id }</td>
		<td>${li.name }</td>
		<td>${li.sex }</td>
		<td>
			<a href="update1?id=${li.id }">修改</a>
			<a href="delete?id=${li.id }">删除</a>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td><a href="addUser">添加</a></td>
	</tr>
</table>
</body>
</html>