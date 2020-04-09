<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'ok.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


</head>

<body>
<form action="${pageContext.request.contextPath}/findAll">
	<table align="center" border="1">
		<thead>
			<tr>
				<th>姓名</th>
				<th>班级</th>
				<th>考试类型</th>
				<th>月份</th>
				<th>成绩</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="s" items="${s}">
				<tr>
					<td>${s.student.name }</td>
					<td>${s.classroom.name }</td>
					<td>${s.king.name}</td>
					<td>${s.month.name}</td>
					<td>${s.grede}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
     <a href="index">返回</a>
  </form>   
</body>
</html>