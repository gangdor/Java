<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${result}</h2>
<%if(request.getAttribute("inputPage")!=null) {%>
<h2><a href="/springedu/lottoForm2.html">${inputPage}</a></h2>
<%} %>
</body>
</html>