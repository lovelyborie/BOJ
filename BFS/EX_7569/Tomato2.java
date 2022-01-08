package EX_7569;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class Tomato2 {
	static int M,N,H; //가로 세로 높이
	static int[][][] farm;
	static boolean[][][] Visited;
	static Queue<tomato> queue;
	static int riping_day;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		H = scan.nextInt();
		farm = new int[N][M][H];
		Visited = new boolean[N][M][H];
		queue = new LinkedList<>();
		riping_day = 0;
		for(int k=0 ; k<H ; k++) {
			for (int i=0 ; i<N ; i++) {
				for (int j=0 ; j<M ; j++) {
					farm[i][j][k] = scan.nextInt();
					if(farm[i][j][k] == 1) {
						queue.add(new tomato (i,j,k,1));
						Visited[i][j][k] = true;
						}
					if(farm[i][j][k] == -1) {
						Visited[i][j][k] = true;
						}
					}
				}
			}
		Ripe();
		System.out.println(check());
	}
	
	
	public static class tomato {
		int x,y,z,date;
		tomato (int x,int y,int z,int date){
			this.x = x;
			this.y = y;
			this.z = z;
			this.date = date;
		}
	}
	
	public static void Ripe() {
		int[] dx = {-1,1,0,0,0,0};
		int[] dy = {0,0,-1,1,0,0};
		int[] dz = {0,0,0,0,-1,1};
		while (!queue.isEmpty()) {
			tomato tom = queue.poll();
			int now_x = tom.x;
			int now_y = tom.y;
			int now_z = tom.z;
			int now_date = tom.date;
			for (int i = 0 ; i<6 ; i++) {
				int next_x = now_x + dx[i];
				int next_y = now_y + dy[i];
				int next_z = now_z + dz[i];
				int next_date = now_date + 1;
				if(fresh(next_x,next_y,next_z) && !Visited[next_x][next_y][next_z]) {
					queue.add(new tomato(next_x,next_y,next_z,next_date));
					Visited[next_x][next_y][next_z] = true;
					farm[next_x][next_y][next_z] = next_date;
				}
			}
		}
	}
	
	public static boolean fresh(int x,int y,int z) {
		if(x<0 || x>=N || y<0 || y>=M || z<0 || z>=H)
			return false;
		return true;
	}
	
	public static int check() {
		for(int k=0 ; k<H ; k++) {
			for (int i=0 ; i<N ; i++) {
				for (int j=0 ; j<M ; j++) {
					if (farm[i][j][k] == 0) {
						return -1;
						}
					riping_day = Math.max(riping_day,farm[i][j][k]);
					}
				}
			}
		return riping_day-1;
	}
}
