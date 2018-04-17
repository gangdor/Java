package day8;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f[] = new Friend[5];
		f[0] = new Friend("ÇÑÁö¹Î", "010-4824-6578", "hjm6578@naver.com");
		f[1] = new Friend("ÀüÁöÇö", "010-7287-1237", "jjy1237@naver.com");
		f[2] = new Friend("±èÅÂÈñ", "010-7891-3157", "kth3157@naver.com");
		f[3] = new Friend("¼ÛÇı±³", "010-6328-1985", "shg1985@naver.com");
		f[4] = new Friend("±è°æ¹Î", "010-5332-6549", "kkm6549@naver.com");

		System.out.println("ÀÌ¸§" + "\t" + "ÀüÈ­¹øÈ£" + "\t\t" + "¸ŞÀÏÁÖ¼Ò");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getInfo());
		}
		/*
		 * for(Friend data : f){ System.out.println(data.getInfo()); }
		 */

	}

}
