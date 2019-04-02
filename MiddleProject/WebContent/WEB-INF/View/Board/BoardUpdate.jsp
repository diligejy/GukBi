<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updatefinish.do">
		글번호 <input name = "no" value = "${result.no}" readonly="readonly">
		제목 <input name="title" id="title" value="${result.title} "><br>
		서브타이틀 <input name="subtitle" id="subtitle" value="${result.subtitle}" /><br>
		내용 <input id="contents" name="contents" value="${result.contents}">
		<br> <input type="submit" value="확인"> 
		<a href="board.do">취소</a>
	</form>
</body>
</html>