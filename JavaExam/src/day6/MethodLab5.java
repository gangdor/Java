package day6;
import day6.MethodTest5;
public class MethodLab5 {

	public static void main(String[] args) {
		System.out.println("[결과 출력]");
		int r1[]= powerArray(2);
		int r2[]= powerArray(3);
		int r3[]= powerArray(4);
		int r4[]= powerArray(10);
		
		
		MethodTest5.printNumbers(r1);
		MethodTest5.printNumbers(r2);
		MethodTest5.printNumbers(r3);
		MethodTest5.printNumbers(r4);
		
	}
	
	public static int[] powerArray(int num){
		int r[] = {1,2,3,4,5,6,7,8,9,10};
		r[0]=r[num-1];
		for (int i = 1; i < r.length; i++) {
			r[i]=r[i-1]+num;
		}
		/*for(int i=0; i<10; i++){
			array[i]=(i+1)*num;
		}*/
		
		return r;
	}
}
