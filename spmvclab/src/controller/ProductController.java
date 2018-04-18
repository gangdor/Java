package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import vo.ProductVO;

@Controller
@SessionAttributes("p")
public class ProductController {
	@ModelAttribute("p")
	public ProductVO createProductVO() {
		System.out.println("ProductVO 객체생성");
		return new ProductVO();
	}
	/*@RequestMapping(value="/product.do")
	public String handle(@ModelAttribute("p")ProductVO vo, @RequestParam(value="pid")String product) {
		if(product.equals("p001")) vo.setAppleNum(1);
		else if(product.equals("p002")) vo.setBananaNum(1);
		else if(product.equals("p003")) vo.setOrangeNum(1);
		return "productview";
	}*/
	@RequestMapping(value="/product.do") //html에서 넘어오는 쿼리에 따라 setter를 자동으로 호출함
	public String handle(@ModelAttribute("p")ProductVO vo) {
		return "productview";
	}
	//鍮꾩슦湲�
	@RequestMapping(value="/buy.do")
	public String handle(SessionStatus status) {
		status.setComplete();
		System.out.println("ProductVO 객체 삭제");
		return "productview";
	}
}
