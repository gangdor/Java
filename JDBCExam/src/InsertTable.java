import java.sql.*;
public class InsertTable {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into product values('00001','10','자바 프로그래밍', 50, 16500)");
			stmt.executeUpdate("insert into product values('00002','10','J2EE 구현 패턴', 40, 12000)");
			stmt.executeUpdate("insert into product values('00003','10','JSP 2.0', 60, 18000)");
			stmt.executeUpdate("insert into product values('1','10','JSP 2.0', 1, 18000)");
			stmt.executeUpdate("insert into product values('2','10','JSP 2.0', 1, 18000)");
			stmt.executeUpdate("insert into product values('3','10','JSP 2.0', 0, 18000)");
			stmt.executeUpdate("insert into product values('4','10','JSP 2.0', 1, 18000)");
			System.out.println("데이터들을 추가하였습니다.");
			stmt.close();
			conn.close();
			
			
					
		}
		
		catch(SQLException e){
			System.out.println("오류 발생 " + e);
		}
	}

}
