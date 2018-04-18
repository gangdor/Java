package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@WebServlet("/clicklog2")
public class ClickLogServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String productID = request.getParameter("productID");
			Logger log = LogManager.getLogger("case3");
			log.info(productID);
			request.setAttribute("ID", productID);
			request.getRequestDispatcher("/jspexam/logView.jsp").forward(request, response);
	}
}
