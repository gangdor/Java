package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClickLogServlet
 */
@WebServlet("/clicklog")
public class ClickLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		try {
			writer = new FileWriter("c:/Temp/product.log", true); // 파일 생성
			
			String productID = request.getParameter("productID");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddhhmm");
			Calendar cal = Calendar.getInstance();
			writer.write(sdf.format(cal.getTime()));
			writer.write(productID);
			writer.write("\r\n");
			writer.append("appendTest!!!");
			System.out.println("파일에 출력완료!!");
			request.setAttribute("ID", productID);
			request.getRequestDispatcher("/jspexam/logView.jsp").forward(request, response);
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				if (writer != null)
					writer.close(); // 파일 사용한거 클로즈
			} catch (Exception e) {
				System.out.println("파일을 닫는동안 오류 발생!!");
			}
		}
	}
}
