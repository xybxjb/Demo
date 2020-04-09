<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update2" method="get">
		  <input type="hidden" name="id" value="${u.id }"><br>
	姓名：<input type="text" name="name" value="${u.name }"><br>
	性别：<input type="text" name="sex" value="${u.sex }"><br>
	<input type="submit" value="修改">
</form>
</body>
</html>