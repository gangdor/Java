package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.VisitorMyBatisDAO;
import model.vo.VisitorVO;
@WebServlet("/visitorservlet")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchCheck = request.getParameter("searchName");
		List<VisitorVO> list=null;
		int state = 0;
		String x ="";
		if(searchCheck==null){
			list = new VisitorMyBatisDAO().list();
			state=2;
			x = "selectList";
		}
		else{
			list = new VisitorMyBatisDAO().listByName(searchCheck);
			state=3;
			x = "searchList";
		}
		request.setAttribute(x, list);
		request.setAttribute("state", state);
		request.getRequestDispatcher("/jspexam/visitorView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("htmlname");
		String text = request.getParameter("htmltext");
		VisitorMyBatisDAO vdao = new VisitorMyBatisDAO();
		VisitorVO vv = new VisitorVO();
		vv.setName(name);
		vv.setMemo(text);
		boolean result = vdao.insert(vv);
		String output="";
		if(result){
			output= name + "님의 글이 저장되었습니다.";
		}
		else{
			output= "오류!! "+ name + "님의 글 저장에 실패했습니다.";
		}
		request.setAttribute("state", 1);
		request.setAttribute("messege", output);
		request.getRequestDispatcher("/jspexam/visitorView.jsp").forward(request, response);
	}

}
