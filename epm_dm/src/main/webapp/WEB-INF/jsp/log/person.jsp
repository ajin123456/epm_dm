<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table cellpadding="0" cellspacing="0" border="1">
		<tr>
			<th>主键</th>
			<th>姓名</th>
			<th>密码</th>
		</tr>
		<c:forEach items="${pList }" var="p">
			<tr>
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.password }</td>
			</tr>
		</c:forEach>
	
	</table>
	<hr/>
	
	<form action="insert" method="post">
	<input type = "hidden" name = "id" value="0">
		名<input type = "text" name="name">
		码<input type = "text" name="password">
		<input type = "submit" value="tijiao">
	</form>
	
	<hr>
</body>
</html>