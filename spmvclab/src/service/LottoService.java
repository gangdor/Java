package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LottoDAO;

@Service
public class LottoService {
	public LottoService(){
		System.out.println("LottoService ��ü ����");
	}
	@Autowired
	LottoDAO lottoDAO = null;
	public boolean getLottoProcess(int lottoNum){
		boolean result = false;
		int randomNumber = lottoDAO.getLottoNumber();
		System.out.println("---���� : " + randomNumber);
		System.out.println("---�Է��� ��  : " + lottoNum);
		if(randomNumber == lottoNum)
			return true;
		return result;
		
	}
}
