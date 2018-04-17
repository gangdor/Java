package day10.case1;

//좋지않은 코드이다. 인터페이스가 필요하겠군. case2로 이동
public class TVUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
