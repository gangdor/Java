package exam2;

import org.springframework.stereotype.Component;

@Component("Evening")
public class EveningGreetingImpl implements Greeting{
	public void greet(){
		System.out.println("����� ����Ǽ���.");
	}
}
