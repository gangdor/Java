package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.LottoService;
import vo.LottoVO;

@Controller
public class LottoController1 {
	public LottoController1(){
		System.out.println("LottoController1객체생성");
	}
	@Autowired
	private LottoService lottoService;
	@RequestMapping("/lotto.do")
	public String lottoProcess(LottoVO vo) {
		if (lottoService.getLottoProcess(vo.getLottoNum())) {
			vo.setResult("��ī��ī!");
		} else {
			vo.setResult("�ƽ��׿�. �絵���ϼ���!!");
		}
		return "lottoView";
	}
}
