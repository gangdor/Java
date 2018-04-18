import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BlobRead {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		Statement stmt= conn.createStatement();
		ResultSet rset = stmt.executeQuery
				("select * from picture where name = 'mnmn.png'");
		if(rset.next()){
			Blob blob = rset.getBlob(2);
			System.out.println(blob.length());
			InputStream is = blob.getBinaryStream();
			FileOutputStream fo = new FileOutputStream("newmnmn.png");
			int c= 0;
			while((c=is.read()) != -1)
				fo.write(c);
			
			fo.close();
			is.close();
			//\2���� ��߉�
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe newmnmn.png");
		}
		else{
			System.out.println("����� �����Ͱ� �����ϴ�.");
		}
					
		}
	}

