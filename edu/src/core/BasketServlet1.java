package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasketServlet1
 */
@WebServlet("/basket1")
public class BasketServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =  response.getWriter();
		String x = request.getParameter("productID");
		System.out.println(x);
		out.print(x + " 상품 1개 ");
		out.print("<a href='/edu/htmlexam/productlog.html'>" + "상품 선택으로 돌아가기</a>");
		out.close();
	}

}
