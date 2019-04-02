
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="com.board.dao.BoardDaoImpl, com.board.biz.*, com.board.controller.*, com.board.vo.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${result} ${result.getNo() } ${result.no}
	<%
		BoardVo bv = (BoardVo) request.getAttribute("result");
	%>
	<br>
	<form action="updatecontent.do?no=<%=bv.getNo()%>" method="POST">
		<input type="submit" class="btn btn-dark" value="수정">
	</form>
	<br>
	<form action="deletecontent.do?no=<%=bv.getNo()%>" method="POST">
		<input type="submit" class="btn btn-dark" value="삭제">
	</form>
	<a href="board.do">홈으로</a>
</body>
</html>