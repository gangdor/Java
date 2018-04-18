package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MultiController {	
	@RequestMapping(value="/select1.do", method=RequestMethod.GET)
	public String select() {
		System.out.println("select 처리............");
		return  "view";//뷰의 이름을 리턴한다.
	}
	@RequestMapping(value="/search1.do", method=RequestMethod.GET)
	public String search() {
		System.out.println("search 처리............");
		return "view";
	}
	@RequestMapping(value="/insert1.do")
	public String insert(int pageno) {
		System.out.println("insert 처리............"+pageno);
		return  "view";
	}
}
