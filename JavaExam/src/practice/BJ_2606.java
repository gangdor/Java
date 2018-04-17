package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class BJ_2606 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();// ����
		int e;
		e = scan.nextInt();// ������
		LinkedList<Integer>[] stack = new LinkedList[n+1]; // ǥ���Ҹ���Ʈ
		boolean visit[] = new boolean[n+1]; // �湮 �迭
		int vertex;
		int edge;

		// e =6;
		// ����Ʈ �����س��� ����
		for (int j = 1; j <= n; j++) {
			stack[j] = new LinkedList<>();
		}
		// ������ �ٽ� ����
		for (int i = 1; i <= e; i++) { // ���� �� ��ŭ ����
			vertex = scan.nextInt(); // ���
			edge = scan.nextInt(); // ����
			// ���Ⱑ ������, ��û�� ����, ��ũ�� ����Ʈ�� ����� �׷����� ���� �ٲ㼭�� ���� ���־�� �ϴ±���!!!!!!!!!!!!
			stack[vertex].add(edge);
			stack[edge].add(vertex);
		}
		/*stack[1].add(3);
		stack[2].add(3);*/
		//stack[3].add(2); ������� �ȵǳ�.
		dfs(1, visit, stack);
		for(boolean a : visit)
			System.out.print(a + "\t");
		
		int count = 0;
		for (int i = 0; i < visit.length; i++) {
			if (visit[i] == true) {
				count++;
			}
		}
		System.out.println(count-1);
		scan.close();
	}

	// dfs�� ��;�
	public static void dfs(int node, boolean visit[], LinkedList<Integer> stack[]) {
		boolean temp[] = visit;
		temp[node] = true; // �湮 ���� , true�� �湮��
		//if (stack[node] != null) { // node�� ������� �ʴٸ� �����ؾߴ�
		for(int i : stack[node]){
			if (visit[i] == true) {// �湮 �ѰŸ� ������
				continue;
			}
			dfs(i, temp, stack);
		
					
		}	
			
		
		//}
	}
}
