package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.MemberVO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/memberservlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MemberVO mem = new MemberVO();
		mem.setName(request.getParameter("name"));
		mem.setPhone(request.getParameter("phone"));
		mem.setAccount(request.getParameter("account"));
		mem.setPassword(request.getParameter("password"));
		
		HttpSession se = request.getSession();
		if(se.getAttribute("member1")==null){
			se.setAttribute("member1", mem);
		}
		
		request.setAttribute("member1", mem);
		request.getRequestDispatcher("/jspexam/MemberView.jsp").forward(request, response);
		
	}

}
