package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CalcController{
	@RequestMapping("/calcspring.do")
	public ModelAndView proc(int num1, int num2, char what){
		ModelAndView mav = new ModelAndView();
		int result=0; String str = null;
		switch(what){
			case '+': result=num1+num2; break;
			case '-': result=num1-num2; break;
			case '*': result=num1*num2; break;
			case '/': {
				if(num2!=0) result=num1/num2; 
				else if(num2==0){
					str="errorResult";
				} 
			}
		}
		if(str==null){
			str="calcResult";
			mav.addObject("calc",result);
		}
		mav.setViewName(str);
		return mav;
	}
}