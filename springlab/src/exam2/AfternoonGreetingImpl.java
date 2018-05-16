package exam2;

import org.springframework.stereotype.Component;

@Component("Afternoon")
public class AfternoonGreetingImpl implements Greeting {
	public void greet(){
		System.out.println("즐거운 오후 되세요");
	}
}
