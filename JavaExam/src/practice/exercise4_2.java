package practice;

public class exercise4_2 {

	public static void main(String[] args) {
		int sum=0;
		int max=0;
		//int x=0;
		for (int i = 1; i <= 20; i++) {
			//2ÀÇ¹è¼ö
			if(i%2!=0 && i%3!=0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
