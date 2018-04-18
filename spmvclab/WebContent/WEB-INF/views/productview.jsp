<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="vo.ProductVO" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ProductVO pro = (ProductVO)session.getAttribute("p"); %>
<% if(pro!=null){ %>
<h1>선택된 상품 정보는 다음과 같습니다.</h1>
<hr>
선택된 사과의 개수 : <%=pro.getAppleNum() %><br>
선택된 바나나의 개수 : <%=pro.getBananaNum() %><br>
선택된 한라봉의 개수 : <%=pro.getOrangeNum() %><br>
<%} else{%>
장바구니가 비워졌어요.
<%} %>
<hr>
<a href="/spmvclab/product.html" style="background : linear-gradient(red, yellow, pink, white, green)">상품 선택화면</a>
</body>
</html>