package anno05;

import org.springframework.stereotype.Component;

@Component //�ڵ����� ��ü�̸��� koreaTire�̴�
public class KoreaTire implements Tire{
	@Override
	public String getBrand() {
		return "�ѱ� Ÿ�̾�";
	}
}
