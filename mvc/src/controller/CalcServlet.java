package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcservlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		char what = request.getParameter("what").charAt(0);
		int result=0;
		
		switch(what){
			case '+': result=num1+num2; break;
			case '-': result=num1-num2; break;
			case '*': result=num1*num2; break;
			case '/': {
				if(num2!=0) result=num1/num2; 
				else if(num2==0){
					request.getRequestDispatcher("/jspexam/errorResult.jsp").forward(request, response);
					return;
				} 
				break;
			}
		}
		request.setAttribute("calc", result);
		request.getRequestDispatcher("/jspexam/calcResult.jsp").forward(request, response);
		
		
	}

}
