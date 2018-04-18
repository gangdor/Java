package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EduServlet
 */
@WebServlet("/eduservlet")
public class EduServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("studentName");
		int score = Integer.parseInt(request.getParameter("studentAvg"));
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;
		String path = "";
		if(90<=score){
			path="gradeA.jsp";
		}
		else if(80<=score && score<=89){
			path="gradeB.jsp";
		}
		else if(70<=score && score<=79){
			path="gradeC.jsp";
		}
		else if(score<=69){
			path="gradeD.jsp";
		}
		rd = request.getRequestDispatcher("/jspexam/" + path);
		rd.forward(request, response);

	}

}
