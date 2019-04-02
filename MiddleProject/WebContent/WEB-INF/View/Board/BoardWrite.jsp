<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id = "contents" action = "insertcontent.do"  enctype="multipart/form-data">
		제목<input name="title2" id="title" size="80" /><br> 
		서브타이틀 <input name="subtitle" id="subtitle" /><br> 
		아이디 <input name="n_id" id="n_id" /><br> <!-- 
		파일1 : <input type="file" name="file1"><br> 
		파일2 : <input type="file" name="file2"><br>  -->
		내용 <input id="contents" name="contents" ><br>
		<br> <input type="submit" value="확인">
		<a href = "board.do">취소</a>
	</form>
</body>
</html>