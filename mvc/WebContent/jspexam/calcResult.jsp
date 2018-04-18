<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int result=0; %>
<h1>연산 요청 결과</h1>
<hr>
결과 : 
<span style="color : #ff0066">
<%= result=(int)request.getAttribute("calc") %>
</span>
<br><a href="/mvc/htmlexam/calcForm.html">입력화면</a>

</body>
</html>