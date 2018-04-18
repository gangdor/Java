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
		System.out.println("countMethod1 ȣ��");
		return new CountVO();
	}
	@ModelAttribute("count2")
	public CountVO countMethod2(){
		System.out.println("countMethod2 ȣ��");
		return new CountVO();
	}
	@RequestMapping(value="/count.do") //return�� ������ RequestMapping�� �̸��� ã�´�.
	public void handle(@ModelAttribute("count1")CountVO vo1, //count1�̶�� �̸��� ��ü ������
			@ModelAttribute("count2")CountVO vo2){
		System.out.println("handle���� ��� : " + vo1.getCountNum() + vo2.getCountNum());
		System.out.println("================================");
	}
	@RequestMapping(value="/countdel.do")
	public void handle(SessionStatus status){
		if(status.isComplete()){
			System.out.println("�̹� COMPLETE ��");
		} else{
			System.out.println("�̹��� COMPLETE ��Ŵ");
			status.setComplete(); //���Ǿȿ� ����ִ� ��ü���� ���ִ� ���, ������ ���ش�. �κ� ���� �Ұ���
		}
		System.out.println("================================");
	}
}