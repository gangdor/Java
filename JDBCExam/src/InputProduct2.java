import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class InputProduct2 {

	public static void main(String[] args) throws Exception {
		boolean flag = false;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		PreparedStatement pstmt = conn.prepareStatement
				("insert into product values(?,?,?,?,?)");
		ResultSet rs=null;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.println("데이터를 입력받습니다.");
				//scan.nextLine();
				System.out.print("상품 ID를 입력하세요 : ");
				String id = scan.nextLine();

				System.out.print("상품 CLASSID를 입력하세요 : ");
				String classid = scan.nextLine();
				
				System.out.print("상품명을 입력하세요 : ");
				String name = scan.nextLine();
				System.out.print("상품 가격을 입력하세요 : ");
				String price = scan.nextLine();
				float re_price = Float.parseFloat(price);
				System.out.print("상품 재고량을 입력하세요 : ");
				String balance = scan.nextLine();
				int re_balance = Integer.parseInt(balance);
				
				pstmt.setString(1, id);
				pstmt.setString(2, classid);
				pstmt.setString(3, name);
				pstmt.setFloat(4, re_price);
				pstmt.setInt(5, re_balance);
				pstmt.executeUpdate();
				pstmt.close();
				pstmt=conn.prepareStatement("select * from product");
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("id") + "   ");
					System.out.println(rs.getString("classid") + "   ");
					System.out.println(rs.getString("name") + "   ");
					System.out.println(rs.getInt("balance") + "   ");
					System.out.println(rs.getFloat("price"));

				}
				
			}
			
			catch (Exception e) {
				// System.out.println(ex);
				e.printStackTrace();
				flag = true;
			} //
			
		} while (flag);
		
		if(rs!=null){
			rs.close();
			conn.close();
			scan.close();
			}
	}
}
