<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드 기능</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js">
	
</script>
</head>
<body>
	<h2>파일 업로드</h2>
	<!-- method = "post" enctype= "multipart/form-data -->
	<form name="form1" method="post" enctype="multipart/form-data"
		action="upload_result.jsp">
		이름 : <input name="name"><br> 
		제목 : <input name="subject"><br>
		파일1 : <input type="file" name="file1"><br> 
		파일2 : <input type="file" name="file2"><br> 
		<input type="submit" value="업로드">
	</form>
</body>
</html>
