package model.dao;

import java.util.ArrayList;

import org.junit.Test;

import model.vo.NewsVO;

public class NewsDAOTest {

	@Test
	public void dbtest() {
		NewsDAO dao = new NewsDAO();
		NewsVO vo = new NewsVO();
		vo.setWriter("둘리");
		vo.setTitle("ㅋㅋㅋ");
		vo.setContent("수행이 잘됩니다요.");
		vo.setId(8);
		//dao.insert(vo);
		
		//ArrayList<NewsVO> myList = dao.listAll();
		
		
		//dao.delete(12);
		
		//for(NewsVO data : myList){
//			System.out.println(data.toString());
	//	}
		
		//System.out.println(myList.size());
		
		/*vo = dao.listOne(10);
		System.out.println(vo);*/
		System.out.println();
		dao.update(vo);
	}

}
