package EX_7576;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class Tomato {
	static int M,N; //가로 세로
	static int[][] farm;
	static boolean[][] Visited;
	static Queue<tomato> queue;
	static int riping_day;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		farm = new int[N][M];
		Visited = new boolean[N][M];
		queue = new LinkedList<>();
		riping_day = 0;
		for (int i=0 ; i<N ; i++) {
			for (int j=0 ; j<M ; j++) {
				farm[i][j] = scan.nextInt();
				if(farm[i][j] == 1) {
					queue.add(new tomato (i,j,1));
					Visited[i][j] = true;
				}
				if(farm[i][j] == -1) {
					Visited[i][j] = true;
				}
			}
		}
		Ripe();
		System.out.println(check());
	}
	
	
	public static class tomato {
		int x,y,date;
		tomato (int x,int y,int date){
			this.x = x;
			this.y = y;
			this.date = date;
		}
	}
	
	public static void Ripe() {
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		while (!queue.isEmpty()) {
			tomato tom = queue.poll();
			int now_x = tom.x;
			int now_y = tom.y;
			int now_date = tom.date;
			for (int i = 0 ; i<4 ; i++) {
				int next_x = now_x + dx[i];
				int next_y = now_y + dy[i];
				int next_date = now_date + 1;
				if(fresh(next_x,next_y) && !Visited[next_x][next_y]) {
					queue.add(new tomato(next_x,next_y,next_date));
					Visited[next_x][next_y] = true;
					farm[next_x][next_y] = next_date;
				}
			}
		}
	}
	
	public static boolean fresh(int x, int y) {
		if(x<0 || x>=N || y<0 || y>=M)
			return false;
		return true;
	}
	
	public static int check() {
		for (int i=0 ; i<N ; i++) {
			for (int j=0 ; j<M ; j++) {
				if (farm[i][j] == 0) {
					return -1;
				}
				riping_day = Math.max(riping_day,farm[i][j]);
			}
		}
		return riping_day-1;
	}
}
