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
				System.out.printf("%,d��",Integer.parseInt(rs.getString("salary")));*/
				
				System.out.printf("%s(%s) %,d��",rs.getString("first_name"),rs.getString("last_name"),Integer.parseInt(rs.getString("salary")));
				System.out.println();
				
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(SQLException e){
			System.out.print("DB���� ���� �߻� : " + e.getMessage());
		}		
	}
}


/*
���õ� �ҽ��� ������ ���� ����� �����մϴ�.

(����� ����Ŭ ������ hr �̸� ���̺��� employees �Դϴ�.)

�����̸��� ù���ڸ� ���ڷ� �����ϸ� �ش� ���ڰ� �̸�(first_name)�� ���Ե� ������ 

������ �̸�(first_name),��(last_name), �޿�(salary) ����ϴ� kaja() �޼ҵ带 �����Ͻʽÿ�.

SQLException �߻��� "DB���� ���� �߻� : XXX" �̶�� �޽����� ����Ͻÿ�.

���⿡�� XXX�� �����޽����Դϴ�.


<< ���� ��� >>

Elizabeth(Bates)	7,300��
Eleni(Zlotkey)	10,500��
Ellen( Abel)	11,000��*/


