package practice;
import java.util.Scanner;
import java.util.TreeSet;

public class BJ_2839 {

	public static void main(String[] args) {
		//System.out.println("3이상 5000이하의 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num;
		num=scan.nextInt();
		
		System.out.println(cal(num));
		scan.close();
	}

	public static int cal(int n) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		int x = 0;
		int y = 0;

			for (x = 0; x <= 1001; x++) {
				for (y = 0; y <= 1668; y++) {
					if (n == 5 * x + 3 * y) 
						a.add(x + y);
				}
			}
		
		Object[] arr = new Object[a.size()];
		arr = a.toArray();
	
		if(!a.isEmpty()) return (int)arr[0];
		else return -1;
	}

}
