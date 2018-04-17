package day10.case2;

//삼성 객체든, LG 객체든 상관이 없다. 즉, 결합도가 낮다. case3으로 이동
public class TVUser {
	public static void main(String[] args) {
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
