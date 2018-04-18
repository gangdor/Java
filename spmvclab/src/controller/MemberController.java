package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vo.MemberVO;

@Controller
public class MemberController{
@RequestMapping("/memberSpring")	
	/*public ModelAndView proc(String name, String phone, String account, String password){
		ModelAndView mav = new ModelAndView();
		
		MemberVO mem = new MemberVO();
		mem.setName(name);
		mem.setPhone(phone);
		mem.setAccount(account);
		mem.setPassword(password);
		
		mav.addObject("member1", mem);
		mav.setViewName("MemberView");
		return mav;
	}*/

	public ModelAndView proc(MemberVO mem){
	ModelAndView mav = new ModelAndView();
	mav.addObject("member1", mem);
	mav.setViewName("MemberView");
	return mav;
	}
}
