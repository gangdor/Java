package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/queryget", "/querypost"})
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("guestName");
		int number = Integer.parseInt(request.getParameter("num"));
		out.print("<h1>너의 이름은 "+userName+"</h1>");
		out.print("<h1>너의 숫자는 "+number+"</h1>");
		out.print("<a href='/edu/htmlexam/query.html'>" + "입력 화면으로 가기</a>");
		out.close();
	}*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("guestName");
		int number = Integer.parseInt(request.getParameter("num"));
		out.print("<h1>너의 이름은 "+userName+"</h1>");
		out.print("<h1>너의 숫자는 "+number+"</h1>");
		out.print("<a href='/edu/htmlexam/query.html'>" + "입력 화면으로 가기</a>");
		out.close();
	}
}
