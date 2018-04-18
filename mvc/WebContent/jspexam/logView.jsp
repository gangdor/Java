<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String id = (String)request.getAttribute("ID");  %>
<h1 style='color : red'>선택한 상품은 <%=id %>이네요.</h1>
<br>
<a href="/mvc/htmlexam/productlog.html">메인으로</a>
</body>
</html>