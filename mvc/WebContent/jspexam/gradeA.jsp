<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grade A</title>
</head>
<body>
<h1>
<%=request.getParameter("studentName") %>
님은 A등급입니다. 우수한 성적이네요. \(^~^)/
</h1>
<br>
<a href="/mvc/htmlexam/eduForm.html">성적입력 화면으로</a>
</body>
</html>