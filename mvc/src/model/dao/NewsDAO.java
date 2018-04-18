package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.ConnectDB;
import model.vo.NewsVO;
import model.vo.VisitorVO;

public class NewsDAO {
	
	private Connection connectDBCP(){
		Connection conn = null;
		//Context context = new InitialContext();
		//DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbctest","jdbctest");
		}
		catch(Exception e){
			
		}
		
		return conn;
		
	}
	public boolean insert(NewsVO vo){
		boolean result = true;
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		PreparedStatement pstmt = null;
		try {
			conn = connectDBCP();
			pstmt = conn.prepareStatement("insert into news values(news_seq.nextval,?, ?, ?, sysdate, 0)");
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
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
	
	public ArrayList<NewsVO> listByName(String name){
		ArrayList<NewsVO> list = new ArrayList<NewsVO>();
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
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news where writer like" +"'%"+name+"%'");
			NewsVO vo = null;
			while (rs.next()) {
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWriteDate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
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
	
	public ArrayList<NewsVO> listByTitle(String title){
		ArrayList<NewsVO> list = new ArrayList<NewsVO>();
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			stmt = conn.createStatement();
			System.out.println(title+"  야호");
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news where title like " +"'%"+title+"%'");
			NewsVO vo = null;
			while (rs.next()) {
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWriteDate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
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
	
	public ArrayList<NewsVO> listByContent(String content){
		ArrayList<NewsVO> list = new ArrayList<NewsVO>();
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			stmt = conn.createStatement();
			System.out.println(content+"  야호");
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news where content like " +"'%"+content+"%'");
			NewsVO vo = null;
			while (rs.next()) {
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWriteDate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
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
	
	
	public ArrayList<NewsVO> listAll(){
		ArrayList<NewsVO> listAll = new ArrayList<NewsVO>();
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = connectDBCP();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news");
			NewsVO vo = null;
			while(rs.next()){
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWriteDate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
				listAll.add(vo);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}
			catch(SQLException e){
				
			}
			obj.close();
		}
		return listAll;
	}
	
	public boolean delete(int id){
		boolean result = true;
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		PreparedStatement pstmt = null;
		try{
			conn=connectDBCP();
			pstmt = conn.prepareStatement("delete news where id="+id);
			pstmt.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
			result = false;
		}
		finally {
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
	
	public NewsVO listOne(int id){
		NewsVO vo = new NewsVO();
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = connectDBCP();
			stmt = conn.createStatement();
			stmt.executeUpdate("update news set cnt = cnt+1 where id = "+id);
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news where id="+id);
			while(rs.next()){
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWriteDate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
			}
		}
		catch(Exception e){
			
		}
		finally{

			try{
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}
			catch(SQLException e){
				
			}
			
		}
		return vo;
	}
	
	public boolean update(NewsVO vo){
		boolean result = true;
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		PreparedStatement pstmt = null;
		try {
			conn = connectDBCP();
			pstmt = conn.prepareStatement("update news set writer=?, title=?, content=? where id=?");
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setInt(4, vo.getId());
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
}
