<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section class="content container-fluid">
		<div class="col-lg-12">
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">댓글작성</h3>
				</div>
				<div class="box-body">
					<div class="form-group">
						<label for="newReplyText">댓글 내용</label> <input
							class="form-control" id="newReplyText" name="replyText"
							placeholder="댓글 내용을 입력하세요">
					</div>
					<div class="form-group">
						<label for="newReplyWriter">댓글 작성자</label> <input
							class="form-control" id="newReplyWriter" name="replyWriter"
							placeholder="댓글 작성자를 입력해주세요">
					</div>
				</div>
				<div class="box-footer">
					<ul id="replies">

					</ul>
				</div>
				<div class="box-footer">
					<ul class="pagination pagination-sm no-margin">

					</ul>
				</div>
			</div>
		</div>

	</section>
</body>
</html>