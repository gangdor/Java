package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorServlet1
 */
@WebServlet("/visitor1")
public class VisitorServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =  response.getWriter();
		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("visitname");
		String text = request.getParameter("visittext");
		
		Calendar cal = Calendar.getInstance();
		
		
		out.println("<h2>"+name + "님이 " + cal.get(Calendar.YEAR) +"년"+(cal.get(Calendar.MONTH) + 1) + "월" + cal.get(Calendar.DATE) +"일"+ "에 남긴 글입니다."+"</h2>");
		out.println("<h2>-------------------------------------------------------</h2>");
		out.println("<h2>"+text+"</h2>");
		out.print("<a href='/edu/htmlexam/visitor.html'>" + "방명록 남기기</a>");
	}

}
