<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.util.ArrayList"
	import="model.vo.NewsVO"
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>News 게시판</title>
<% ArrayList<NewsVO> list = (ArrayList)request.getAttribute("newsList"); %>
<% NewsVO vo2 = (NewsVO)request.getAttribute("listone");  %>
</head>
<body>
<style>
body{
	width:70%;
	margin-left:auto;
	margin-right:auto;
}
#head{
	
	text-align : center;
	background : black;
	padding : 5px;
	
}
h1{
	color : white;
}
table{
	width : 100%;
	border : 3px solid black;
	border-collapse : collapse;
}
#board th{
	height:50px;
	color : #3399ff;
	text-align:left;
	border-bottom : 1px solid #ddd;
}
#board td{
	padding : 8px;
	border-bottom : 1px solid #ebe9e7;
}
#board tr:hover{
	background-color:#f5f5f5;
}
#newscontent{
	text-align : center;
}
#printdiv{
	text-align : center;
}
.textInput{
	width: 300px;
}
#searchDiv{
	text-align : right;
}
</style>

<div id="head"><h1>뉴스 게시판</h1></div>
<table id="board">
<tr>
<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>
</tr>
<%for(NewsVO vo : list){ %>
<tr>
<td><%=vo.getId() %></td><td><a href="/mvc/news.do?action=read&newsid=<%=vo.getId()%>"><%=vo.getTitle() %></a></td><td><%=vo.getWriter() %></td>
<td><%=vo.getWriteDate()%></td><td><%=vo.getCnt() %></td>
</tr>
<%} %>
</table>
<br>

<div id="searchDiv">
<form method="get" action="/mvc/news.do">
<select name="action"><option value="searchName">이름</option><option value="searchTitle">제목</option><option value="searchContent">내용</option></select>
<input type="text" name="searchWhat" placeholder="검색"> &nbsp; <input type="submit" value="검색">
</form></div>

<hr>
<br>
<%if(vo2==null){ %>
<div id="printdiv">
<form method="post" action="/mvc/news.do">
<input type="button"  value="뉴스작성" onclick="ShowDiv();"><br>
<div id="newswrite" style="display:none">
<input class="textInput" type="text" name="jswriter" placeholder="작성자명을 입력해주세요"><br><br>
<input class="textInput" type="text" name="jstitle" placeholder="제목을 입력해주세요"><br><br>
<textarea class="textInput" rows="5" name="jscontent" placeholder="내용을 입력해주세요"></textarea><br>
<input type="hidden" name="action" value="insert">
<input type="submit" value="저장"> &nbsp;
<input type="reset" value="재작성"> &nbsp;
<input type="button" value="취소" onclick="HideDiv();">
</div></form>
</div>
<script>
function ShowDiv(){
	document.getElementById("newswrite").setAttribute("style","display:");
}
function HideDiv(){
	document.getElementById("newswrite").setAttribute("style","display:none;");
}
</script>

<%}
else{ %>
<div id="newscontent">
<h2>뉴스내용</h2>
<%int id = vo2.getId(); %>
<form method="post" action="/mvc/news.do">
<input class="textInput" type="text" name="jsntitle" value="<%=vo2.getTitle() %>"><br><br>
<input class="textInput" type="text" name="jsnwriter" value="<%=vo2.getWriter() %>"><br><br>
<textarea class="textInput" rows="5" name="jsncontent" cols="50"><%=vo2.getContent() %></textarea><br>
<input type="button" value="확인" onclick="HideDiv2();"> &nbsp;
<input type="submit" value="수정"> &nbsp;
<input type="hidden" name="action" value="update">
<input type="hidden" name="newsid" value="<%=vo2.getId()%>">
<input type="button" value="삭제" onclick="Delete();">
</form>
</div>
<br>
<div id="printdiv">
<form method="post" action="/mvc/news.do">
<input type="button"  value="뉴스작성" onclick="ShowDiv();"><br>
<div id="newswrite" style="display:none">
<input class="textInput" type="text" name="jswriter" placeholder="작성자명을 입력해주세요"><br><br>
<input class="textInput" type="text" name="jstitle" placeholder="제목을 입력해주세요"><br><br>
<textarea class="textInput" rows="5" name="jscontent" placeholder="내용을 입력해주세요"></textarea><br>
<input type="hidden" name="action" value="insert">
<input type="submit" value="저장"> &nbsp;
<input type="reset" value="재작성"> &nbsp;
<input type="button" value="취소" onclick="HideDiv();">
</div></form>
</div>


<script>
function ShowDiv(){
	document.getElementById("newswrite").setAttribute("style","display:");
}
function HideDiv(){
	document.getElementById("newswrite").setAttribute("style","display:none;");
}
function HideDiv2(){
	document.getElementById("newscontent").setAttribute("style","display:none;");
}
function Delete(){
	location.href="/mvc/news.do?action=delete&newsid="+<%=vo2.getId()%>;
}
</script>


<%}%>
</body>
</html>