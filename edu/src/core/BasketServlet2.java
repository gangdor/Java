package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthScrollBarUI;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =  response.getWriter();
		HttpSession session = request.getSession(); //세션 생성
		if(session.getAttribute("cnt")==null){
			session.setAttribute("cnt", new int[10]);
		}
		int session_v[]=(int[])session.getAttribute("cnt");
		String x = request.getParameter("productID");
		System.out.println(x);
		
		if(x.equals("p001"))
			session_v[0]++;
		else if(x.equals("p002"))
			session_v[1]++;
		else if(x.equals("p003"))
			session_v[2]++;
		else if(x.equals("p004"))
			session_v[3]++;
		else if(x.equals("p005"))
			session_v[4]++;
		else if(x.equals("p006"))
			session_v[5]++;
		else if(x.equals("p007"))
			session_v[6]++;
		else if(x.equals("p008"))
			session_v[7]++;
		else if(x.equals("p009"))
			session_v[8]++;
		else if(x.equals("p010"))
			session_v[9]++;
		else if(x.equals("regame")){ //상품 비울떄
			for (int i = 0; i < session_v.length; i++) {
				session_v[i]=0;
			}
			out.print("<h1>장바구니를 모두 비웁니다.</h1><br>");
			out.print("<a href='/edu/htmlexam/productlog.html'>" + "상품 선택으로 돌아가기</a>");
			out.close();

		}
		
		out.print("<body style='text-align : center'>");
		out.print("<h1>선택한 상품 리스트</h1>"+"<br>");
		out.print("<hr>");
		out.print("<div style='width : 20%; text-align : center; margin-right : auto; margin-left : auto'>");
		for (int i = 0; i < session_v.length; i++) {
			if(session_v[i]!=0 && i!=9)
				out.print("<ul><li><h3>"+ String.format("p%14d", i+1) + " 상품  " + session_v[i] + "개 " + "</h3></li></ul>");
			else if(session_v[i]!=0 && i==9)
				out.print("<ul><li><h3>"+"p0"+ (i+1) + " 상품  " + session_v[i] + "개 " + "</h3></li></ul>");
		}
		out.print("</div>");
		out.print("<a href='/edu/htmlexam/productlog.html'>" + "상품 선택으로 돌아가기</a>");
		out.print("&nbsp&nbsp&nbsp&nbsp&nbsp");
		out.print("<a href='/edu/basket2?productID=regame'>" + "상품 비우기</a>");
		out.print("</body>");
		out.close();
	}

}
