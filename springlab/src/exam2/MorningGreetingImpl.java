package exam2;

import org.springframework.stereotype.Component;

@Component("Morning")
public class MorningGreetingImpl implements Greeting{
	@Override
	public void greet(){
		System.out.println("������ ��ħ�Դϴ�.");
	}
}
