<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String nick = (String) session.getAttribute("nick");
	//쿼리스트링으로 넘어온 데이터 가져오기
	String nick2 = request.getParameter("nick2");
	String nick3 = (String)request.getAttribute("nick3");
	%>
	<%=nick%>님 환영합니다!
	<a href="logout.jsp">로그아웃</a>
</body>
</html>