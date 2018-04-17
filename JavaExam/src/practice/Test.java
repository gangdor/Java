package practice;

import java.util.ArrayList;

public class Test {
	static int V = 5;
	static int[] visited = new int[V];
	static ArrayList<Integer>[] adjList = new ArrayList[V]; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				adjList[0] = new ArrayList<>(); 
				adjList[0].add(1); 
				adjList[0].add(2); 
				adjList[1] = new ArrayList<>(); 
				adjList[1].add(0); 
				adjList[1].add(2); 
				adjList[2] = new ArrayList<>(); 
				adjList[2].add(0); 
				adjList[2].add(1); 
				adjList[2].add(3); 
				adjList[2].add(4); 
				adjList[3] = new ArrayList<>();
				adjList[3].add(2); 
				//adjList[4] = new ArrayList<>(); 
				//adjList[4].add(2); 
				dfs(0); 
				} 
			
	public static void dfs(int node) { 
		// 방문 정점 표시 
		visited[node] = 1; 
		System.out.println(node+1); 
		if(adjList[node] != null) { 
			// 모든 인접한 정점들을 방문 
			for(int adjacent : adjList[node]) 
			{ // 방문한 정점이면 건너 뜀 
				if(visited[adjacent] == 1) 
				{ 
					System.out.println(adjacent+1); 
					continue; 
					} // 재귀호출
				dfs(adjacent); 
				} 
			} 

}

}
