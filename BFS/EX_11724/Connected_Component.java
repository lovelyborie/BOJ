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
		Scanner scan = new Scanner(System.in); //����,��ü����
		N = scan.nextInt();
		M = scan.nextInt();
		Visited = new boolean[N+1]; //1~N ��� ����
		Connection = new boolean[N+1][N+1]; // ��尣�� ���� ����
		Component = 0;
		
		for(int i=0 ; i<M ; i++) { //�����Էºκ�
			int from = scan.nextInt();
			int to = scan.nextInt();
			Connection[from][to] = true; //����� ����
			Connection[to][from] = true;
		}
		
		for(int i=1 ; i<=N ; i++) { //�湮���� ���� ���Ȯ��,����Ž���� �׷찳�� �ϳ��߰�
			if(!Visited[i]) {
				Check(i);
				Component++; //�׷쿡 ���� ���������� �ʿ����������Ƿ�
			}
		}
		
		System.out.println(Component);
	}
	
	static void Check (int num) { //����� ��尡 �ִ��� check�ϴ� bfs �޼ҵ�
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