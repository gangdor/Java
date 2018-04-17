package day3;

public class ForTest7 {

	public static void main(String[] args) {
		int x = 1, y = 10;
		for(; x<=5 && y>=5; x++, y--){
			System.out.println("x="+x+", y=" + y);
		}
		System.out.println("x="+x+", y=" + y);
	}

}
