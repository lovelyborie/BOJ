package EX_1012;
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Freshbaechu {
	static int[][] cabbage; //간선
	static boolean[][] visit; //노드의 방문여부
	static int N,M;
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine());
		for(int i = 0 ; i <Testcase ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			visit = new boolean [M][N];
			cabbage = new int[M][N] ;
			int bug = 0;
			for (int j = 0 ; j<count ; j++) {
				st = new StringTokenizer(br.readLine()," ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				cabbage[x][y] = 1;
			}
			for(int a =0 ; a<M ; a++) {
				for(int b = 0 ; b<N ; b++) {
					if (cabbage[a][b] == 1 && visit[a][b] ==false) {
						bfs(a,b);
						bug ++;
					}
				}
			}
			System.out.println(bug);
		}
	}
	static void bfs(int a,int b) {
		Queue<int[]>queue = new LinkedList<int[]>();
		queue.add(new int[] {a,b});
		visit[a][b] = true;
		while(!queue.isEmpty()) {
			int x = queue.peek()[0];
			int y = queue.peek()[1];
			queue.poll();
			for (int i = 0 ; i<4 ; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
					if(!visit[nx][ny] && cabbage[nx][ny] == 1) {
						queue.add(new int[] {nx,ny});
						visit[nx][ny] = true;
					}
				}
			}
		}
	}
}*/
import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; //bfs구현을 위한 큐
import java.util.Arrays;
import java.util.Scanner;

public class Freshbaechu {
	static int[][] cabbage; //간선
	static boolean[][] visit; //노드의 방문여부
	static int N,M;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Testcase = scan.nextInt();
		int i = 0;
		while(i<Testcase) {
			M = scan.nextInt();
			N = scan.nextInt();
			int count = scan.nextInt();
			visit = new boolean [M][N];
			cabbage = new int[M][N] ;
			int bug = 0;
			for (int j = 0 ; j<count ; j++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				cabbage[x][y] = 1;
			}
			for(int a =0 ; a<M ; a++) {
				for(int b = 0 ; b<N ; b++) {
					if (cabbage[a][b] == 1 && visit[a][b] ==false) {
						bfs(a,b);
						bug ++;
					}
				}
			}
			System.out.println(bug);
			i++;
		}
	}
	static void bfs(int a,int b) {
		Queue<int[]>queue = new LinkedList<int[]>();
		queue.add(new int[] {a,b});
		visit[a][b] = true;
		while(!queue.isEmpty()) {
			int x = queue.peek()[0];
			int y = queue.peek()[1];
			queue.poll();
			if(x-1>=0 && cabbage[x-1][y] == 1 && visit[x-1][y] ==false ) {
				queue.add(new int[] {x-1,y});
				visit[x-1][y] = true;
			}
			if(x+1<M && cabbage[x+1][y] == 1 && visit[x+1][y] ==false ) {
				queue.add(new int[] {x+1,y});
				visit[x+1][y] = true;
			}
			if(y-1 >=0 && cabbage[x][y-1] == 1 && visit[x][y-1] ==false ) {
				queue.add(new int[] {x,y-1});
				visit[x][y-1] = true;
			}
			if(y+1 <N && cabbage[x][y+1] == 1 && visit[x][y+1] ==false ) {
				queue.add(new int[] {x,y+1});
				visit[x][y+1] = true;
			}
		}
	}
}