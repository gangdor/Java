package anno10;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")            
public class MyMessage {
	String message;
	
	public MyMessage(){
		System.out.println("��ü ����");
		message="��̰� ��ô�";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}	
}
