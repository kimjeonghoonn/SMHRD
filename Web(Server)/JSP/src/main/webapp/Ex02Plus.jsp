<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1~100까지의 합 만들기</h1>
	<%
	// 스크립트릿 : 자바 문법을 사용하는 공간
	// 자바코드를 활용하여 1~100까지 합 구하기
	int plus =0;
	for(int i=1;i<101;i++){
		plus +=i;
	}
	
	
	%>
	<%=plus %>

	
	
	
</body>
</html>