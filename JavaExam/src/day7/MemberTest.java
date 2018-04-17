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
		Member m1 = new Member(); //클래스 이름은 첫글자가 대문자이다.
		//참조형의 기본값은 null값
		System.out.println(m1);
		System.out.println(m1.getMemberInfo());
		m1.name = "고길동";
		m1.account = "guest";
		m1.password = "@12345";
		m1.birthyear =2010;
		System.out.println(m1.getMemberInfo());
		m1=null;
	}
}
