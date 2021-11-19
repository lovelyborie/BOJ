package EX_1260;

import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; //bfs구현을 위한 큐
import java.util.Arrays;
import java.util.Scanner;

public class DFS_BFS {
	static int[][] edge; //간선
	static boolean[] visit; //노드의 방문여부
	static int N,M,Start;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		Start = scan.nextInt();
		edge = new int[1001][1001];
		visit = new boolean[1001];
		Arrays.fill(visit, false);
		for(int i = 0 ; i<M ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			edge[a][b] = edge[b][a] = 1;
		}
		dfs(Start);
		Arrays.fill(visit, false);
		System.out.println();
		bfs();
	}
	
	static void dfs(int now) {
		visit[now] = true;
		System.out.print(now+" ");
		for (int k = 1 ; k<=N ; k++) {
			if(edge[now][k] == 1 && visit[k] == false) {
				dfs(k);
			}
		}
	}
	
	static void bfs() {
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.offer(Start);
		visit[Start] = true ;
		System.out.print(Start + " ");
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for (int j = 1; j<=N ; j++) {
				if(edge[now][j] ==1 && visit[j] == false) {
					queue.offer(j);
					visit[j] = true;
					System.out.print(j+" ");
				}
			}
		}
	}

}
