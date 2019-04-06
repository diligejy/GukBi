
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page
	import="com.board.dao.BoardDaoImpl, com.board.biz.*, com.board.controller.*, com.board.vo.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<body>
	<div style="width: 700px; text-align: center;">
		<input value="${result}">
		<%
			BoardVo bv = (BoardVo) request.getAttribute("result");
		%>
		<br>
	</div>
	<form action="updatecontent.do?no=<%=bv.getNo()%>" method="POST">
		<input type="submit" class="btn btn-dark" value="수정">
	</form>
	<br>
	<form action="deletecontent.do?no=<%=bv.getNo()%>" method="POST">
		<input type="submit" class="btn btn-dark" value="삭제">
	</form>
	<br>
	<script>
		$(document).ready(function() {
			$.ajax({
				type : "GET",
				url : "replyall.do",
				error : function() {
					alert("통신실패!!");
				},
				success : function(data) {
					//alert("통신데이터 값: "+data);
					$("#commentList").html(data);
				}
			});
		});
	</script>
	<!-- 댓글 작성 -->
	<form id="contents" action="replyinsert.do">

		<div style="width: 700px; text-align: center;">
		아이디 <input name="r_n_id" id="r_n_id" /><br> 
		내용 <input name="r_contents" id="r_contents" /><br>
			<br> <input type="submit" value="댓글쓰기">
			<input type= "hidden"  name = "no" value = "<%=bv.getNo()%>">
		</div>
	</form>
	<br>
	<br>


	<!-- 댓글 목록을 출력할 영역  -->

	<div id="commentList"></div>

</body>
</html>