import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Scanner;

public class InputProduct {

	public static void main(String[] args) throws Exception {
		boolean flag = false;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("Database: " + meta.getDatabaseProductName());
		System.out.println("version : " + meta.getDatabaseProductVersion());
		System.out.println("User name : " + meta.getUserName());
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.println("�����͸� �Է¹޽��ϴ�.");
				//scan.nextLine();
				System.out.print("��ǰ ID�� �Է��ϼ��� : ");
				String id = scan.nextLine();
				String re_id = "'" + id + "'";

				System.out.print("��ǰ CLASSID�� �Է��ϼ��� : ");
				String classid = scan.nextLine();
				String re_classid = "'" + classid + "'";
				
				System.out.print("��ǰ���� �Է��ϼ��� : ");
				String name = scan.nextLine();
				String re_name = "'" + name + "'";
				System.out.print("��ǰ ������ �Է��ϼ��� : ");
				String price = scan.nextLine();
				float re_price = Integer.parseInt(price);
				System.out.print("��ǰ ����� �Է��ϼ��� : ");
				String balance = scan.nextLine();
				int re_balance = Integer.parseInt(balance);
				
				Statement stmt = conn.createStatement();
				String result = String.format("insert into product values(%s, %s, %s, %f, %d)", re_id, re_classid,
						re_name, re_price, re_balance);

				stmt.executeUpdate(result);

				System.out.println("�����͵��� �߰��Ͽ����ϴ�.");

				ResultSet rs = stmt.executeQuery("select * from product");
				while (rs.next()) {
					System.out.println(rs.getString("id") + "   ");
					System.out.println(rs.getString("classid") + "   ");
					System.out.println(rs.getString("name") + "   ");
					System.out.println(rs.getInt("balance") + "   ");
					System.out.println(rs.getFloat("price"));

				}
				rs.close();
				stmt.close();
				conn.close();
				scan.close();
			}
			
			catch (Exception e) {
				// System.out.println(ex);
				System.out.println("�ùٸ� ���� �ƴմϴ�.");
				flag = true;
			} //
			
		} while (flag);
		
	}
}
