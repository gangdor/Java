<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8}">
<title>JSP 예제</title>
</head>
<body>
<h2>JSP에서의 멤버변수와 지역변수</h2>
<hr>
<%! int member_v = 0; %>
<% int local_v =0; %>
<h3>member_v : <%= ++member_v %></h3>
<h3>local_v : <%= ++local_v %></h3>
</body>
</html>