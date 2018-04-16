package core;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CountVO;

/**
 * Servlet implementation class ShareObjectServlet1
 */
@WebServlet("/share1")
public class ShareObjectServlet1 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CountVO vo = new CountVO();
		vo.setNumber(1000);
		request.setAttribute("count1", vo); //count1이라는 이름으로, vo객체를 저장
		request.getRequestDispatcher("/jspexam/countView1.jsp").forward(request, response);
		//요청재지정
	}
}
