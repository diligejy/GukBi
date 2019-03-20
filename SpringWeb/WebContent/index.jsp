<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String root = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-size: 1.5em; margin: 20px 20px 50px 20px;">

	<a href="<%=root%>/step01/hello.do">step01/hello</a>
	<br>
	<a href="<%=root%>/step02/hello.do">step02/hello</a>
	<br>
	<a href="<%=root%>/step03/list.do?pg=1">step03/list</a>
	<br>

</body>
</html>