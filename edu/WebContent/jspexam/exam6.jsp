<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8}">
<title>JSP 예제</title>
</head>
<body>
	<h2>JSP로 구현한 구구단</h2>
	<%
int dan = Integer.parseInt(request.getParameter("dan"));
	if(dan<=9){
	for(int i=1; i<=9; i++){
%>
	<%= dan %>
	x
	<%=i %>
	=
	<%= dan*i %><br>
	<%
	}
%>
	<hr>
	<%
	for(int i=1; i<=9; i++){
		out.print(dan + "x" + i + "=" + dan*i +"<br>");	
	}
	}else{
%>
	<h3 style="color: red">1에서 9사이의 값을 입력하도록 하시오</h3>
	}
<%
	 }
%>



</body>
</html>