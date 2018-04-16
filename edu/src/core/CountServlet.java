package core;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/count") //매우 중요
public class CountServlet extends HttpServlet {
	int member_v;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset=utf-8");
		PrintWriter out = response.getWriter();
		int local_v=0;
		HttpSession session = request.getSession();
		if(session.getAttribute("cnt")==null){
			session.setAttribute("cnt", new int[1]);
		}
		int session_v[]=(int[])session.getAttribute("cnt");
		session_v[0]++;
		member_v++;
		local_v++;
		out.print("<h2>session_v[0] : "+session_v[0]+"</h2>" );
		out.print("<h2>member_v : "+member_v+"</h2>" );
		out.print("<h2>local_v : "+local_v+"</h2>" );
		out.close();
	}
}
