package day7;

class Member {
	String name;
	String account;
	String password;
	int birthyear;
	String getMemberInfo(){
		return name + ":" + account +':'+birthyear + ':' + password;
	}
}

public class MemberTest {
	public static void main(String[] args) {
		Member m1 = new Member(); //Ŭ���� �̸��� ù���ڰ� �빮���̴�.
		//�������� �⺻���� null��
		System.out.println(m1);
		System.out.println(m1.getMemberInfo());
		m1.name = "��浿";
		m1.account = "guest";
		m1.password = "@12345";
		m1.birthyear =2010;
		System.out.println(m1.getMemberInfo());
		m1=null;
	}
}
