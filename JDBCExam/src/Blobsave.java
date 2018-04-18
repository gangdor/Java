import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Blobsave {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		File file = new File("mnmn.png");
		InputStream is = new FileInputStream(file);
		PreparedStatement pstmt = conn.prepareStatement
				("Insert into picture values (?, ?, picture_seq.nextval)");
		pstmt.setString(1, "mnmn.png");
		pstmt.setBinaryStream(2, is, file.length());
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		System.out.println("저장 성공");
	}

}
