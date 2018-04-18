package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.ProductVO;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/productservlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ProductVO pro = new ProductVO();
		ProductVO pro = null;
		String x = request.getParameter("pid");
		HttpSession session = request.getSession();
		if (session.getAttribute("productCnt") == null) {
			session.setAttribute("productCnt", new ProductVO());
		}
		pro = (ProductVO) session.getAttribute("productCnt");
		if (x.equals("p001")) {
			pro.setAppleNum(1);
		} else if (x.equals("p002")) {
			pro.setBananaNum(1);
		} else if (x.equals("p003")) {
			pro.setOrangeNum(1);
		} 
		
		if(x.equals("clear")){
			pro.setAppleNum(pro.getAppleNum()*(-1));
			pro.setBananaNum(pro.getBananaNum()*(-1));
			pro.setOrangeNum(pro.getOrangeNum()*(-1));

		}
		request.getRequestDispatcher("/jspexam/productview.jsp").forward(request, response);
	}
}
