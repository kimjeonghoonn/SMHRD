package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/A02Join")
public class A02Join extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw2 = request.getParameter("pw2");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birth = request.getParameter("birth");
		String[] hobbies = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String text = request.getParameter("text");
		String newtext = text.replace("\n","<br>");
		
		//돌려주기 위해서 돌려줄 페이지 설정
		response.setContentType("text/html; charset=UTF-8");
		
		//출력 스트림, 값을 출력하기 위한 통로
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		if(pw.equals(pw2)){
			out.print("비밀번호가 일치합니다"+"<br>");
		}
		else {
			out.print("비밀번호가 일치하지 않습니다"+"<br>");
		}
		out.print("성별 : " + gender+"<br>");
		out.print("혈액형 : " + blood+"<br>");
		out.print("생일 : " + birth+"<br>");
		out.print("취미 : ");
		for(String h : hobbies) {
			out.print(h +" ");
			
		}
		out.print("<br>");
		out.print("좋아하는 색 : " + color+"<br>");
		out.print("남기고 싶은 말 : " + newtext+"<br>");
		out.print("</body>");
		out.print("</html>");
	}

}
