import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertVisitor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jdbctest","jdbctest");
		PreparedStatement pstmt = conn.prepareStatement(
				"insert into visitor values(?, ?, ?)");
		pstmt.setString(1, "둘리3");
		//pstmt.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
		pstmt.setString(2, "2018-01-10");
		//pstmt.setTimestamp(2, new java.sql.Timestamp(new java.util.Date().getTime()));
		pstmt.setString(3, "HI");
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		System.out.println(args[0]+"님의 글이 저장 완료되었어요");
	}

}
