package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LottoServlet1
 */
@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); //출력용 객체 생성
		HttpSession sese = request.getSession(); 
		if(sese.getAttribute("cnt")==null){
			sese.setAttribute("cnt", new int[1]);
		}
		
		int sese_arr[] = (int[])sese.getAttribute("cnt");
		sese_arr[0]++;
		
		int number = Integer.parseInt(request.getParameter("num"));
		int answer = (int)(Math.random()*3)+1;
		
		System.out.println("전달 된 값 : "+ number + "추출된 값 : " + answer);
		
		
		//sese_arr
		if(sese_arr[0]>3){
			out.print("3번의 기회를 모두 사용하셨습니다요. 그만 하세요 제발");
		}
		
		else{
			if(number==answer){
				out.print("<h1>추카추카염, 다시하려면 껐다가 키세요</h1>");
			}
			else{
				out.print("<h1>다음 기회에...</h1>");
				out.print("<a href='/edu/htmlexam/lotto.html'>" + "로또 응모</a>");
			}
		}
		
		out.close();
		
		
		
	}

	
}
