<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- fmt를 사용하기위한 태그 라이브러리 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 전체출력</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<h2>board_list 페이지입니다.</h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일자</th>
			<th>조회수</th>
		</tr>
		<!-- forEach 문은 리스트 객체 타입을 꺼낼때 많이 활용된다. -->
		<c:forEach var="row" items="${list}">
			<tr>
				<!-- 컨트롤러에서 넘겨준 list 모델 객체를 쓰는 방법을 잘 익혀두자 -->
				<td>${row.no}</td>
				<td><a href="readcontent.do?no=${row.no}">${row.title}</a></td>
				<td>${row.n_id}</td>
				<td>
					<!-- 데이터 타입을 사용하는 방법 --> <fmt:formatDate value="${row.regdate}"
						pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
				<td>${row.viewcount}</td>
			</tr>
		</c:forEach>
	</table>
	
	
	<a href= "boardwrite.do">게시물 작성</a>
	<a href = "updatecontent.do">게시물 수정</a>
	<a href="deletecontent.do">게시물 삭제</a>
</body>
</html>
