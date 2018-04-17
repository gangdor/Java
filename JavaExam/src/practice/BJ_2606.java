package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class BJ_2606 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();// 노드수
		int e;
		e = scan.nextInt();// 간선수
		LinkedList<Integer>[] stack = new LinkedList[n+1]; // 표현할리스트
		boolean visit[] = new boolean[n+1]; // 방문 배열
		int vertex;
		int edge;

		// e =6;
		// 리스트 생성해놓고 ㅇㅇ
		for (int j = 1; j <= n; j++) {
			stack[j] = new LinkedList<>();
		}
		// 이포문 다시 점검
		for (int i = 1; i <= e; i++) { // 간선 수 만큼 돌고
			vertex = scan.nextInt(); // 노드
			edge = scan.nextInt(); // 간선
			// 여기가 문제여, 엄청난 정보, 링크드 리스트라도 양방향 그래프는 서로 바꿔서도 지정 해주어야 하는구나!!!!!!!!!!!!
			stack[vertex].add(edge);
			stack[edge].add(vertex);
		}
		/*stack[1].add(3);
		stack[2].add(3);*/
		//stack[3].add(2); 양방향이 안되네.
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

	// dfs는 재귀야
	public static void dfs(int node, boolean visit[], LinkedList<Integer> stack[]) {
		boolean temp[] = visit;
		temp[node] = true; // 방문 정점 , true면 방문함
		//if (stack[node] != null) { // node가 비어있지 않다면 접근해야댐
		for(int i : stack[node]){
			if (visit[i] == true) {// 방문 한거면 제끼고
				continue;
			}
			dfs(i, temp, stack);
		
					
		}	
			
		
		//}
	}
}
