package controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EduController{
	@RequestMapping("/eduSpring1.do")
	/*public ModelAndView proc(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		String name = request.getParameter("studentName");
		int score = Integer.parseInt(request.getParameter("studentAvg"));
		//mav.addObject("spring", name);
		String path = "";
		if(90<=score){
			path="gradeA";
		}
		else if(80<=score && score<=89){
			path="gradeB";
		}
		else if(70<=score && score<=79){
			path="gradeC";
		}
		else if(score<=69){
			path="gradeD";
		}
		mav.setViewName(path);
		return mav;
	}*/
	public String proc(int studentAvg){
		String path = "";
		if(90<=studentAvg){
			path="gradeA";
		}
		else if(80<=studentAvg && studentAvg<=89){
			path="gradeB";
		}
		else if(70<=studentAvg && studentAvg<=79){
			path="gradeC";
		}
		else if(studentAvg<=69){
			path="gradeD";
		}
		return path;
	}
}
