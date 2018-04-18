package controller;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthScrollBarUI;

import model.dao.NewsDAO;
import model.vo.NewsVO;

@WebServlet("/news.do")
public class NewsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		ArrayList<NewsVO> list = null;
		if(action==null){
			list = new NewsDAO().listAll();
			request.setAttribute("newsList", list);
		}
		//액션이 일어나면
		else{
				if(action.equals("read")){
					int id = Integer.parseInt(request.getParameter("newsid"));
					NewsVO vo = new NewsDAO().listOne(id);
					request.setAttribute("listone", vo);
					list = new NewsDAO().listAll();
					request.setAttribute("newsList", list);
				}
				else if(action.equals("delete")){
					int id = Integer.parseInt(request.getParameter("newsid"));
					NewsDAO dao = new NewsDAO();
					dao.delete(id);
					list = new NewsDAO().listAll();
					request.setAttribute("newsList", list);
				}
				else if(action.equals("searchName")){
					String Name = request.getParameter("searchWhat");
					NewsDAO dao = new NewsDAO();
					list = dao.listByName(Name);
					//request.setAttribute("newsList", list);
				}
				else if(action.equals("searchTitle")){
					String Title = request.getParameter("searchWhat");
					NewsDAO dao = new NewsDAO();
					list = dao.listByTitle(Title);
					//request.setAttribute("newsList", list);
				}
				else if(action.equals("searchContent")){
					String Content = request.getParameter("searchWhat");
					NewsDAO dao = new NewsDAO();
					list = dao.listByContent(Content);
					//request.setAttribute("newsList", list);
				}
				request.setAttribute("newsList", list);
			}
			//else if(searchCheck==true){list = new NewsDAO().listAll(); request.setAttribute("newsList", list);}
		request.getRequestDispatcher("/jspexam/NewsView.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		NewsVO vo = null;
		NewsDAO dao = null;
		ArrayList<NewsVO> list = null;
		if(action.equals("insert")){
			System.out.println("삽입하자자ㅏㅏㅏㅏㅏ");
			vo = new NewsVO();
			dao = new NewsDAO();
			vo.setWriter(request.getParameter("jswriter"));
			vo.setTitle(request.getParameter("jstitle"));
			vo.setContent(request.getParameter("jscontent"));
			dao.insert(vo);
			
			list = new NewsDAO().listAll();
			request.setAttribute("newsList", list);
			System.out.println("삽입성고오오옹");
		}
		else if(action.equals("update")){
			vo = new NewsVO();
			dao = new NewsDAO();
			vo.setWriter(request.getParameter("jsnwriter"));
			vo.setTitle(request.getParameter("jsntitle"));
			vo.setContent(request.getParameter("jsncontent"));
			vo.setId(Integer.parseInt(request.getParameter("newsid")));
			dao.update(vo);
			
			
			list = new NewsDAO().listAll();
			request.setAttribute("newsList", list);
		}
		request.getRequestDispatcher("/jspexam/NewsView.jsp").forward(request, response);
	}

}
