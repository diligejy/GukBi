<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri='/WEB-INF/tld/HelloTag.tld' prefix='hw'%>
<%@ taglib uri='/WEB-INF/tld/DateTag.tld' prefix='d'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="first" tagdir="/WEB-INF/tags"%>


<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<first:helloWorld />
	</h3>
	<h3>
		<first:HelloTag />
	</h3>
	<h3>
		<first:displayProducts>
			<jsp:attribute name="normalPrice">
				Name : ${name}<br/>
				Price : ${price}
			</jsp:attribute>
			<jsp:attribute name="onSale">
				Name : ${name}<br/>
				origPrice : ${origPrice} <br/>
				salePrice : ${salePrice} <br/>
			</jsp:attribute>
		</first:displayProducts>
	</h3>
	<hr>
	<table border=1>
		<tr><td><first:panel bgcolor="#dda182" color="white" title="exam">math</first:panel></td></tr>
	</table>
</body>
</html>