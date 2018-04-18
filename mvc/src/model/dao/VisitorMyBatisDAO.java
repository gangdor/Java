package model.dao;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.vo.VisitorVO;
public class VisitorMyBatisDAO {
	SqlSessionFactory sqlSessionFactory;
	public VisitorMyBatisDAO(){
		try{
			String resource = "resource/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public boolean insert(VisitorVO vo){
		boolean result=false;
		SqlSession session = sqlSessionFactory.openSession(true);
		try{
			String statement = "resource.VisitorMapper.insertVisitor";
			session.insert(statement,vo);
			result=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return result;
	}
	
	public List<VisitorVO> list(){
		List<VisitorVO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		try{
			String statement = "resource.VisitorMapper.selectVisitor";
			list = session.selectList(statement);
			System.out.println(list.getClass().getName());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;	
		}
	
	public List<VisitorVO> listByName(String name){
		List<VisitorVO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		try{
			String statement = "resource.VisitorMapper.selectByName";
			list = session.selectList(statement,name);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;	
	}
	
}
