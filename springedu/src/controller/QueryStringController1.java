package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QueryStringController1 {
	@RequestMapping("/querystring1.do")
	public ModelAndView proc(String name) {
		ModelAndView mav = new ModelAndView();
		System.out.println("["+name+"]");
		mav.addObject("spring",name);
		mav.setViewName("queryView1");
		return mav;
	}
	@RequestMapping("/querystring2.do")
	public ModelAndView proc(int number) { //
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", number);
		mav.setViewName("queryView1");
		return mav;
	}
	@RequestMapping("/querystring3.do")
	public ModelAndView proc(String name, @RequestParam("num")int number) { //�� �Ű������� �Ķ���� �����Ҷ� number�� �ƴϰ� num���� ����~ 
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", name +" : " + number);
		mav.setViewName("queryView1");
		return mav;
	}

	@RequestMapping("/querystring4.do")
	public ModelAndView proc(@RequestParam(value="myname1") String name1, //���ϳ��� �ָ� value�� �ν� 
							 @RequestParam(value="myname2", required=false) String name2, //required�� �⺻���� false�̴�. ������ �ȿ��� �⺻�� null�̴�.
							 @RequestParam(defaultValue="10") int number1, 
							 @RequestParam(value="NUM2", defaultValue="100") int number2) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", name1+":"+(number1+number2)+":"+name2);
		mav.setViewName("queryView1");
		return mav;

	}
}
