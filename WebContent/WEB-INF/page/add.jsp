<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	contentType="text/html;charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	<title></title>
  </head>
  
  <body style="font-size:30px;">
  		<form action="${pageContext.request.contextPath}/add" method="post">
  			姓名:<select name="student.id">
	  				<c:forEach items="${s}" var="student">
	  					<option value="${student.id} ">${student.name}</option>
	  				</c:forEach>
  				</select>
  				<br/>
  			班级:<select name="classroom.id">
	  				<c:forEach items="${c}" var="cl">
	  					<option value="${cl.id} ">${cl.name}</option>
	  				</c:forEach>
  				</select>
  				<br/>
  			月份:<select name="month.id">
	  				<c:forEach items="${m}" var="month">
	  					<option value="${month.id} ">${month.name}</option>
	  				</c:forEach>
  				</select>
  				<br/>
  			考试类型:<select name="king.id">
	  				<c:forEach items="${k}" var="king">
	  					<option value="${king.id} ">${king.name}</option>
	  				</c:forEach>
  				</select>
  				<br/>
  			成绩:<input type="text" name="grede"/><br/>
  			<input type="submit" value="提交"/>
  		</form>
  </body>
</html>