package day16;

class LocalTest {
	String name = "Java";

	void pr(final String s) {
		final int su = 100;
		System.out.println(s + " : " + su);

		class Local {
			void pr(String is) {
				System.out.println("s : " + s);
				System.out.println("Is : " + is);
				System.out.println(name);
				System.out.println(su);

			}
		}
		
		Local it = new Local();
		it.pr("Local Test");
	}
}

public class InnerTest2 {

	public static void main(String[] args) {
		LocalTest l = new LocalTest(); //LocalTest를 생성하면 , Local은 자동 생성.
		l.pr("Main Call");
	}

}
