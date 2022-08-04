<%@page import="kr.book.domain.BookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title></title>
</head>
<body>
	<h2>보유 도서 현황</h2>
	<%
		List<BookVO> list = (List<BookVO>)request.getAttribute("list");
	%>
	<table class="table table-bordered table-hover">
		<tr> 
			<td>번호</td>
			<td>제목</td>
			<td>작가</td>
			<td>출판사</td>
			<td>ISBN</td>
			<td>보유도서수</td>
		</tr>
		<%for( BookVO book : list){ %>
		<tr> 
			<td><%= book.getNum() %></td>
			<td><%= book.getTitle() %></td>
			<td><%= book.getAuthor() %></td>
			<td><%= book.getCompany() %></td>
			<td><%= book.getIsbn() %></td>
			<td><%= book.getCount() %></td>
		</tr>
		
		<%} %>
		
	</table>
	
	<h2>도서 입력</h2>
	<form action="bookInsert.do" method="post">
		<div>
		<label>제목: </label>
		<input type="text" name="title">
		</div>
		
		<div>
		<label>작가: </label>
		<input type="text" name="author">
		</div>
		
		<div>
		<label>출판사: </label>
		<input type="text" name="company">
		</div>
		
		<div>		
		<label>ISBN: </label>
		<input type="text" name="isbn">
		</div>
		
		<div>
		<label>보유도서 수: </label>
		<input type="text" name="count">
		</div>
		<input type="submit" value="등록">
	</form>
</body>
</html>