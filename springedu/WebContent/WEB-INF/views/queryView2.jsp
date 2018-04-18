<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="vo.QueryVO"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>응답용JSP</title>
</head>
<body>
<h2>QueryStringController2 으로 부터 queryView2.jsp로 forward 됌</h2>
<hr>
<%
	QueryVO vo = (QueryVO)request.getAttribute("queryVO");
	if(vo!=null){%>
		<ul>
		<li>${queryVO.testName}</li>
		<li>${queryVO.testAge}</li>
		<li>${queryVO.testAddr}</li>
		</ul>
<%	} %>
<%-- <h3>전달된 데이터 : ${spring}</h3> --%>
<% String x = (String)request.getAttribute("spring"); %>
<h3>전달된 데이터 : <%=x %></h3>
</body>
</html>