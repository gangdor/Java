import java.sql.*;


public class Prob {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String fn1=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		fn1="E";
		kaja(fn1);
	}
	
	public static void kaja(String fn1){
		try{
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select first_name, last_name, salary from employees where first_name like '"+fn1+"%'" 
					+ "order by salary");
			
			while(rs.next()){
				/*System.out.print(rs.getString("first_name")+"(");
				System.out.print(rs.getString("last_name")+")\t\t");
				System.out.printf("%,d원",Integer.parseInt(rs.getString("salary")));*/
				
				System.out.printf("%s(%s) %,d원",rs.getString("first_name"),rs.getString("last_name"),Integer.parseInt(rs.getString("salary")));
				System.out.println();
				
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(SQLException e){
			System.out.print("DB연동 오류 발생 : " + e.getMessage());
		}		
	}
}


/*
제시된 소스를 가지고 다음 기능을 구현합니다.

(시험용 오라클 계정은 hr 이며 테이블은 employees 입니다.)

직원이름의 첫글자를 인자로 전달하면 해당 글자가 이름(first_name)에 포함된 직원의 

직원의 이름(first_name),성(last_name), 급여(salary) 출력하는 kaja() 메소드를 구현하십시오.

SQLException 발생시 "DB연동 오류 발생 : XXX" 이라는 메시지를 출력하시오.

여기에서 XXX는 오류메시지입니다.


<< 실행 결과 >>

Elizabeth(Bates)	7,300원
Eleni(Zlotkey)	10,500원
Ellen( Abel)	11,000원*/


