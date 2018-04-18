import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "work", "work");
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("Database: " + meta.getDatabaseProductName());
			System.out.println("version : " + meta.getDatabaseProductVersion());
			System.out.println("User name : " + meta.getUserName());
			//conn.close();
			
			//select 추출
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.printf("%s 직원은 월급이  %,d원입니다.\n", rs.getString("ename"), rs.getInt("sal"));
				//System.out.println(rs.getInt("sal") + "   ");
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception ex) {
			System.out.println(ex);
		} //

	}

}
