package day10.case2;

//�Ｚ ��ü��, LG ��ü�� ����� ����. ��, ���յ��� ����. case3���� �̵�
public class TVUser {
	public static void main(String[] args) {
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
