package model;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDB {
	private Connection connect;
	public ConnectDB(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdbctest", "jdbctest");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection getConnect(){
		return connect;
	}
	public void close(){
		try{
			connect.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
