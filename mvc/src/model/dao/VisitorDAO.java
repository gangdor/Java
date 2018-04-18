package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.ConnectDB;
import model.vo.VisitorVO;

public class VisitorDAO {
	public boolean insert(VisitorVO vo) {
		boolean result = true;
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		PreparedStatement pstmt = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("insert into visitor values(?, sysdate, ?)");
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("close 오류 발생");
			}
			obj.close();
		}
		return result;
	}
	
	public List<VisitorVO> list() {
		List<VisitorVO> list = new ArrayList<VisitorVO>();
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name, writedate, memo from visitor");
			VisitorVO vo = null;
			while (rs.next()) {
				vo = new VisitorVO();
				vo.setName(rs.getString(1));
				vo.setWritedate(rs.getString(2));
				vo.setMemo(rs.getString(3));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println("close 오류 발생");
			}
			obj.close();
		}
		return list;

	}
	
	public List<VisitorVO> listByName(String name){
		List<VisitorVO> list = new ArrayList<VisitorVO>();
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			stmt = conn.createStatement();
			System.out.println(name+"  야호");
			rs = stmt.executeQuery("select name, writedate, memo from visitor where name =" +"'"+name+"'");
			VisitorVO vo = null;
			while (rs.next()) {
				vo = new VisitorVO();
				vo.setName(rs.getString(1));
				vo.setWritedate(rs.getString(2));
				vo.setMemo(rs.getString(3));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println("close 오류 발생");
			}
			obj.close();
		}
		return list;

	}
}
