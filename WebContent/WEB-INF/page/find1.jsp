<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html;charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	<title></title>
  </head>
  
  <body style="font-size:30px;">
  <h1>查询</h1>
  	<form action="${pageContext.request.contextPath}/findAll" method="post" >
  		名字:<input type="text" name="name"/><br/>
  		班级:<input type="text" name="classroom"/><br/>
  		月份:<input type="text" name="month"/><br/>
  		<input type="submit" value="查找"/>
  	</form>
  </body>
</html>