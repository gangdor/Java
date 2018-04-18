<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "model.vo.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC 실습2</title>
</head>
<body>
<% MemberVO mem = (MemberVO)request.getAttribute("member1"); %>
<% MemberVO mem1 = (MemberVO)session.getAttribute("member1"); %>

<h1>회원 정보(JSP)</h1>
<hr>
<ul>
<li>
회원 이름 : <%=mem1.getName() %>
</li>
<li>
회원 계정 : <%=mem1.getAccount()%>
</li>
<li>
회원 암호 : <%=mem1.getPassword()%>
</li>
<li>
회원 전화번호 : <%=mem1.getPhone()%>
</li>
</ul>

<jsp:useBean id="member1" class="model.vo.MemberVO" scope="request"/>
<h1>회원 정보(표준액션태그)</h1>
<hr>
<ul>
<li>
회원 이름 : <jsp:getProperty name="member1" property="name" />
</li>
<li>
회원 계정 : <jsp:getProperty name="member1" property="account" />
</li>
<li>
회원 암호 : <jsp:getProperty name="member1" property="password" />
</li>
<li>
회원 전화번호 : <jsp:getProperty name="member1" property="phone" />
</li>
</ul>
 
 
<h1>회원 정보(EL)</h1>
<hr>
<ul>
<li>
회원 이름 : ${requestScope.member1.name}
</li>
<li>
회원 계정 : ${requestScope.member1.account}
</li>
<li>
회원 암호 : ${requestScope.member1.password}
</li>
<li>
회원 전화번호 : ${requestScope.member1.phone}
</li>
</ul>
</body>
</html>