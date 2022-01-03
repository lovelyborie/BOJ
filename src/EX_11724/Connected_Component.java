package EX_11724;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
public class Connected_Component {
	static int N,M,Component; 
	static boolean[][] Connection;
	static boolean[] Visited;
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); //선언,객체생성
		N = scan.nextInt();
		M = scan.nextInt();
		Visited = new boolean[N+1]; //1~N 노드 존재
		Connection = new boolean[N+1][N+1]; // 노드간의 연결 상태
		Component = 0;
		
		for(int i=0 ; i<M ; i++) { //연결입력부분
			int from = scan.nextInt();
			int to = scan.nextInt();
			Connection[from][to] = true; //양방향 연결
			Connection[to][from] = true;
		}
		
		for(int i=1 ; i<=N ; i++) { //방문하지 않은 노드확인,연결탐색후 그룹개수 하나추가
			if(!Visited[i]) {
				Check(i);
				Component++; //그룹에 속한 정점개수는 필요하지않으므로
			}
		}
		
		System.out.println(Component);
	}
	
	static void Check (int num) { //연결된 노드가 있는지 check하는 bfs 메소드
		Queue<Integer> queue = new LinkedList<>();
		queue.add(num);
		Visited[num] = true;
		while(!queue.isEmpty()){
			int now = queue.poll();
			for (int i=0 ; i<=N ; i++) {
				if (!Visited[i] && Connection[now][i]) {
					Visited[i]=true;
					queue.add(i);
				}
			}
		}
	}
}