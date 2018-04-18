<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.vo.VisitorVO"
    import="java.util.List"
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int state = (int)request.getAttribute("state"); %>

<% switch(state){
	case 1:%>
		<% String messege = ""; %>
		<% messege = (String)request.getAttribute("messege"); %>
		<% if(!messege.equals("")){%>
			<h2><%=messege %> </h2>
		<% } %>
		
	<%case 2: %>
		<% List<VisitorVO> list = (List<VisitorVO>)request.getAttribute("selectList");%>
		<% if(list!=null){ %>
		<h1>방명록 리스트</h1>
		<hr>
		<table border="1">
		<%for(VisitorVO vo : list) {%>
			<tr>
			<td><%=vo.getWritedate() %></td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getMemo() %></td>
			</tr>
			<%} %>
		</table>
		<%} %>

		<%case 3: %>
		<% List<VisitorVO> list2 = (List)request.getAttribute("searchList");%>
		<% if(list2!=null){ %>
		<h1>방명록 리스트</h1>
		<hr>
		<table border="1">
		<%for(VisitorVO vo : list2) {%>
			<tr>
			<td><%=vo.getName() %></td>
			<td><%=vo.getWritedate() %></td>
			<td><%=vo.getMemo() %></td>
			</tr>
			<%} %>
		</table>
		<%} %>
<%}%>

<a href="/mvc/visitorservlet">방명록 리스트 보기</a>
<form method="get" action = "/mvc/visitorservlet">
<input type="search" name="searchName"><input type="submit" value="검색">
</form>
<a href="/mvc/htmlexam/visitor.html">처음으로</a>

</body>
</html>