package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

@WebServlet("/DeleteCon")
public class DeleteCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 인코딩
		request.setCharacterEncoding("UTF-8");

		// 아이디 값 가져오기
		String id = request.getParameter("id");

		MemberDAO dao = new MemberDAO();
		int cnt = dao.delete(id);
		
		
		if (cnt > 0) {
			// sql문 실행이 성공하면 메인으로 이동하기

			response.sendRedirect("Main.jsp");
//			out.print(id + "님 삭제되었습니다");
//			out.print("<a href='Main.jsp'>메인으로 가기</a>");
		} else {
			// sql문 실행이 실패하면
			System.out.print("회원삭제 실패!!");
			response.sendRedirect("delete.html");
//			out.print("<a href='delete.html'>회원삭제 돌아가기</a>");
		}

	}

}
