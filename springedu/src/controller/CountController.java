package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import vo.CountVO;

@Controller
@SessionAttributes({"count1", "count2"})
public class CountController {
	@ModelAttribute("count1")
	public CountVO countMethod1(){
		System.out.println("countMethod1 호출");
		return new CountVO();
	}
	@ModelAttribute("count2")
	public CountVO countMethod2(){
		System.out.println("countMethod2 호출");
		return new CountVO();
	}
	@RequestMapping(value="/count.do") //return이 없으면 RequestMapping의 이름을 찾는다.
	public void handle(@ModelAttribute("count1")CountVO vo1, //count1이라는 이름의 객체 꺼내줘
			@ModelAttribute("count2")CountVO vo2){
		System.out.println("handle에서 출력 : " + vo1.getCountNum() + vo2.getCountNum());
		System.out.println("================================");
	}
	@RequestMapping(value="/countdel.do")
	public void handle(SessionStatus status){
		if(status.isComplete()){
			System.out.println("이미 COMPLETE 됌");
		} else{
			System.out.println("이번에 COMPLETE 시킴");
			status.setComplete(); //세션안에 들어있는 객체들을 없애는 기능, 모조리 없앤다. 부분 삭제 불가능
		}
		System.out.println("================================");
	}
}