package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorServlet2
 */
@WebServlet("/visitor2")
public class VisitorServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			rs =stmt.executeQuery("select name, writedate, memo from visitor");
			
			while(rs.next()){
				out.write(rs.getString(1));
				out.write(rs.getString(2));
				out.write(rs.getString(3));
				out.write("<br>");
				
			}
			
		}
		catch(ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로딩 오류");
			return;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			}
			catch(SQLException e){
				System.out.println("close 오류 발생");
			}
		}
		out.print("<hr><a href='/edu/htmlexam/visitor.html'> 방명록작성하기 </a>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  Connection conn = null;
	      PreparedStatement pstmt = null;
	      String name = "";
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");
	         pstmt = conn.prepareStatement("insert into visitor values(?,sysdate,?)");
	         request.setCharacterEncoding("utf-8");
	         name = request.getParameter("visitname");
	         pstmt.setString(1,name);
	         pstmt.setString(2, request.getParameter("visittext"));
	         pstmt.executeUpdate();
	      } catch (ClassNotFoundException e) {
	         System.out.println("JDBC 드라이버 로딩 오류");
	         return;
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (pstmt != null)
	               pstmt.close();
	            if (conn != null)
	               conn.close();
	         } catch (SQLException e) {
	            System.out.println("close 오류 발생");
	         }

	      }
	      response.setContentType("text/html; charset = utf-8");
	      PrintWriter out = response.getWriter();
	      out.println("<h2>" + name + "님글이 저장되었어요..  </h2>");
	      out.println("<a href='/edu/visitor2'> 방명록 리스트 보기</a>");
	      out.close();

	   }


}
