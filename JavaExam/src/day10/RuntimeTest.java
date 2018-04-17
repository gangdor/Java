package day10;

public class RuntimeTest {
//singleton pattern
	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
		r.exec("C:/windows/notepad.exe");

		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
	}
}
