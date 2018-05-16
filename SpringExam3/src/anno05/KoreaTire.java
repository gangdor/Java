package anno05;

import org.springframework.stereotype.Component;

@Component //자동으로 객체이름이 koreaTire이다
public class KoreaTire implements Tire{
	@Override
	public String getBrand() {
		return "한국 타이어";
	}
}
