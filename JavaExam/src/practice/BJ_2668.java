package practice;
import java.util.Scanner;
public class BJ_2668 {
	static int n, arr[], check[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n + 1];
		check = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			Dfs(i);
			for (int j = 1; j <= n; j++) {
				if (check[j] < 2)
					check[j] = 0;
			}
		}

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (check[i] == 2)
				count++;
		}
		System.out.println(count);
		// Arrays.sort(arr);
		for (int i = 1; i <= n; i++) {
			if (check[i] == 2)
				System.out.println(i);
		}

	}
	public static void Dfs(int x) {
		if (check[x] >= 2)
			return;
		check[x]++;

		Dfs(arr[x]);
	}

}
