import java.sql.*;
public class SelectTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product");
		while(rs.next()){
			System.out.println(rs.getString("id") + "   ");
			System.out.println(rs.getString("classid") + "   ");
			System.out.println(rs.getString("name") + "   ");
			System.out.println(rs.getInt("balance") + "   ");
			System.out.println(rs.getFloat("price"));
			
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
