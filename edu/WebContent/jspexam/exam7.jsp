<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8}">
<title>요청 방식에 따른 처리</title>
<style>
	input{
		margin : 3px;
	}
</style>
</head>
<body>
<% if(request.getMethod().equals("GET")){%>
	<h2>원하는 칼라와 날짜를 선택하세요</h2>
	<form method="post" action="/edu/jspexam/exam7.jsp">
		칼라 : <input type="color" name="fcolor"><br>
		날짜 : <input type="date" name="fdate"><br>
		<input type="submit" value="전송">
	</form>
<% }else{ %>
	<script>
		document.body.style.backgroundColor=
				'<%= request.getParameter("fcolor")%>';
	</script>
	<h2>선택 날짜는 <%=request.getParameter("fdate")%>이네요</h2>
	<% } %>
</body>
</html>