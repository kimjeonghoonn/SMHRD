<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<button onclick="loadListMyBatis()">멤버 리스트 출력 마이바티스</button>
	<button onclick="loadList()">멤버 리스트 출력</button>
	<button onclick="loadSmhrd1()">id가 smhrd1인 회원</button>
	<form>
		
	</form>
	
	<script>
		function loadList(){
			$.ajax({
				url : "/myapp/member",
				type : "get",
				dataType : "json",
				success : function(data){
					console.log(data)
				},
				error : function(){
					alert("error")
				}
			})
		}
		function loadListMyBatis(){
			$.ajax({
				url : "/myapp/memberMB",
				type : "get",
				dataType : "json",
				success : function(data){
					console.log(data)
				},
				error : function(){
					alert("error")
				}
			})
		}
		function loadSmhrd1(){
			$.ajax({
				url : "/myapp/member/smhrd1",
				type : "get",
				data : {"id":"smhrd1"},
				dataType : "json",
				success : function(data){
					console.log(data)
				},
				error : function(){
					alert("error")
				}
			})
		}
	</script>
</body>
</html>