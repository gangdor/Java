package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/requestmethod.do")
public class RequestMethodController {
	@RequestMapping(method=RequestMethod.GET)
	public String myGet(){
		System.out.println("GET ��� ��û ó��........");
		return "getResult";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String myPost(){
		System.out.println("POST ��� ��û ó��.........");
		return "postResult";
	}
}
