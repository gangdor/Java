package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import service.LottoService;
import vo.LottoCountVO;
@Controller
@SessionAttributes("lottocount")
public class LottoController2 {
	@Autowired
	LottoService service;
	@ModelAttribute("lottocount") 
	public LottoCountVO command() {
		return new LottoCountVO();
	}	
	@RequestMapping("/lotto2.do")
	public ModelAndView CompareNumber(@RequestParam("input_number") int number, 
			     @ModelAttribute("lottocount") LottoCountVO vo) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("lottoView2");		
		vo.setCount(1);
		System.out.println("--- " + vo.getCount() + "번째 시도입니다.");
		if(vo.getCount() > 3) {
			return (ModelAndView)new ModelAndView("redirect:/lottoForm2.html");
		} else {
			if(service.getLottoProcess(number)) {
				mav.addObject("result", "추카추카! 행운의 번호" + number + "번으로 당첨되었습니다.");
			}
			else { 
				mav.addObject("result", "안타깝네요.. 선택번호 " + number + "번으로 실패하였습니다.");
				if(vo.getCount() < 3) 
					mav.addObject("inputPage", "재시도");
			}
		}
		return mav;
	} 
}
