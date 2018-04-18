import java.sql.*;
public class SelectVisitor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	}
	public static void gazua(){
		try{
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
			Statement stmt = conn.createStatement();
	/*		ResultSet rs = stmt.executeQuery
					("select name, " + "to_char(writedate, 'yyyy\"³â\"') year, memo from visitor order by writedate");*/
			ResultSet rs = stmt.executeQuery
					("select name, writedate, memo from visitor order by name");
			
			while(rs.next()){
				System.out.print(rs.getString("name") + "   ");
				System.out.print(rs.getString("writedate") + "   ");
				System.out.println(rs.getString("memo") + "   ");
			}
			
			rs.close();
			stmt.close();
			conn.close();
	
		}
		catch(SQLException e){
			
		}
		
	}

}
