package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LottoServlet1
 */
@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); //출력용 객체 생성
		int number = Integer.parseInt(request.getParameter("num"));
		int answer = (int)(Math.random()*10)+1;
		
		System.out.println("전달 된 값 : "+ number + "추출된 값 : " + answer);
		
		if(number==answer){
			out.print("<h1>추카추카염</h1>");
			
		}
		else{
			out.print("<h1>다음 기회에...</h1>");
		}
		out.print("<a href='/edu/htmlexam/lotto.html'>" + "로또 응모</a>");
		out.close();
		
		
		
	}

	
}
