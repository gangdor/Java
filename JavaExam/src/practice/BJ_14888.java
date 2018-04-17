package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BJ_14888 {
	static int[] arr; //숫자담자
	static int[] opr; //+,-,*,/
	static int N; 
	static int MAX = -1000000000;
	static int MIN = 1000000000;
	public static void main(String[] args) throws IOException{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//N=sc.nextInt();
		N=Integer.parseInt(br.readLine());
		arr = new int[N];
		//입력
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		opr = new int[4];
		String input2[] = br.readLine().split(" ");
		for (int i = 0; i < 4; i++) {
			opr[i]=Integer.parseInt(input2[i]);
		}
		
		System.out.println("확인 : " + N);
		System.out.println("확인 : " + arr[0] + " " + arr[1] + " " + arr[2]);
		
		
		//연산자 탐색
		Dfs_max(0,arr[0],0,0,0,0);
		System.out.println(MAX);
		System.out.println(MIN);
		br.close();
	}
	//최대
	public static void Dfs_max(int Nindex, int result, int plus, int sub, int mul, int div){
		//종료조건
		if(Nindex==N-1){
			if(result>MAX)
				MAX=result;
			if(result<MIN)
				MIN=result;
			return;
		}
		
		//재귀
		if(plus<opr[0]){//갯수만큼 노드를 만드는거.
			Dfs_max(Nindex+1, result+arr[Nindex+1], plus+1, sub, mul, div);
		}
		if(sub<opr[1]){
			Dfs_max(Nindex+1, result-arr[Nindex+1], plus, sub+1, mul, div);
		}
		if(mul<opr[2]){
			Dfs_max(Nindex+1, result*arr[Nindex+1], plus, sub, mul+1, div);
		}
		if(div<opr[3]){
			Dfs_max(Nindex+1, result/arr[Nindex+1], plus, sub, mul, div+1);
		}
		
	}
}


