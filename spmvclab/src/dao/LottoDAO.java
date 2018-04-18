package dao;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository //DAO 
@Component
public class LottoDAO {
	public LottoDAO(){
		System.out.println("LottoDAO °´Ã¼»ý¼º");
	}
	public int getLottoNumber(){
		Random rand = new Random();
		return rand.nextInt(3)+1;
	}
}
