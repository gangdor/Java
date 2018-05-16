package anno09;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("userService")   //�⺻�� : userServiceImpl
public class UserServiceImpl implements UserService{
	//or @Autowired
	@Resource(name="myuser")
	User member;
	
	public void setMember(User member) {
		this.member = member;
	}

	@Override
	public void addUser() {
		System.out.println("�߰��� ��� : " + member.getUserName());
	}
}
