package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VisitorDAO;
import model.VisitorVO;

/**
 * Servlet implementation class VisitorServlet2
 */
@WebServlet("/visitor3")
public class VisitorServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ArrayList<VisitorVO>list = new VisitorDAO().list();
		String namesearch = request.getParameter("namesearch");
		ArrayList<VisitorVO>listByName = new VisitorDAO().listByName(namesearch);
		
		System.out.println(namesearch);
		
		if(namesearch.equals("")){
			for(VisitorVO vo : list){
				out.write(vo.getName()+ "&nbsp");
				out.write(vo.getWriteDate()+ "&nbsp");
				out.write(vo.getMemo() + "<br>");
			}
		}
		else{
			for(VisitorVO vo : listByName){
				out.write(vo.getName()+ "&nbsp");
				out.write(vo.getWriteDate()+ "&nbsp");
				out.write(vo.getMemo() + "<br>");
		}
			}
		out.print("<hr>");
		out.print("<a href='/edu/htmlexam/visitor.html'> 방명록작성하기 </a>"+"<br>");
		out.print("<form method='get' action='/edu/visitor3'>");
		out.print("<input type='search' name='namesearch'><input type='submit' value='검색'>");
		out.print("</form>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("visitname");
		String visittext = request.getParameter("visittext");
		
		VisitorDAO dao = new VisitorDAO();
		VisitorVO vo  = new VisitorVO();
		vo.setName(name);
		vo.setMemo(visittext);
		boolean result = dao.insert(vo);
	    response.setContentType("text/html; charset = utf-8");
	    PrintWriter out = response.getWriter();
	    if(result){
	    	out.println("<h2>" + name + "님글이 저장되었어요..  </h2>");
	    }
	    else{
	    	out.println("<h2>" + name + "님, 오류가 났어요..  </h2>");
	    }
        out.println("<a href='/edu/visitor3'> 방명록 리스트 보기</a>");
        out.close();

	   }


}
