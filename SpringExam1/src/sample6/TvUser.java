package sample6;

//factory ������ �̿��ؼ� ���յ��� ����
public class TvUser {
	public static void main(String[] args) {
		BeanFactory factory=new BeanFactory();
		Tv tv=(Tv)factory.getBean(args[0]); // lg or samsung
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
