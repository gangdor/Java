import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VisitorApp {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		PreparedStatement pstmt;
		Statement stmt;
		ResultSet rs;

		Scanner scan = new Scanner(System.in);
		String x;
		
		String name;
		String memo;
		String search;

		A: do {
			System.out.println();
			System.out.println("--M--E--N--U--");
			System.out.println("1. ���� �ۼ�");
			System.out.println("2. ���� ����Ʈ ���");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ����");
			System.out.print("���ϴ� ����� �����ϼ��� : ");
			x = scan.nextLine();
			int r_x = Integer.parseInt(x);
			switch (r_x) {
			case 1: {// �̸�, ��¥, �޸�
				try {
					pstmt = conn.prepareStatement("insert into visitor values(?, sysdate, ?)");
					System.out.print("�̸� : ");
					name = scan.nextLine();
					System.out.print("�޸� : ");
					memo = scan.nextLine();
					pstmt.setString(1, name);
					pstmt.setString(2, memo);
					pstmt.executeUpdate();

					pstmt.close();
					System.out.println("���� ����");
				} catch (SQLException e) {
					System.out.println("���� ����");
				}
				continue A;
			}
			case 2: {
				stmt = conn.createStatement();
				rs = stmt.executeQuery("select name, writedate, memo from visitor");
				while (rs.next()) {
					System.out.println("----------------------------");
					System.out.print(rs.getString("name")+"(");
					System.out.print(rs.getDate("writedate") + ")");
					System.out.println();
					System.out.println(rs.getString("memo") + "   ");
				}

				rs.close();
				stmt.close();
				
				continue A;
			}
			case 3: {
				System.out.print("�˻�� �Է��ϼ��� : ");
				search = scan.nextLine();
					//next()�� ù�� ������ ������ �ذ��ϴ� ���.
					stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					rs = stmt.executeQuery("select name, writedate, memo from visitor where memo like " + 
					 "'%"+search+"%'");
					
					
						if(rs.next()==false){
						System.out.println(search + "�� �����ϴ� ���� ã�� �� �����ϴ�.");
						}
						
						else {
							do{
							System.out.println("----------------------------");
							System.out.print(rs.getString("name")+"(");
							System.out.print(rs.getDate("writedate") + ")");
							System.out.println();
							System.out.println(rs.getString("memo") + "   ");
							}while(rs.next());
						}
					
					stmt.close();
					rs.close();
					
					
					continue A;
			}
			case 4: {
				scan.close();
				conn.close();
				System.exit(0);
			}
			}
		}while(true);
	}
}
