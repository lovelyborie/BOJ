package EX_2178;
import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; //bfs구현을 위한 큐
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Maze_search{
	static int N,M;
	static int[][] Maze;
	static boolean[][] Visited;
	public static class Explore {
		int x,y,distance;
		Explore(int x,int y,int distance){
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}
	public static int Maze_Run(int x ,int y, int distance) {
		Queue<Explore>queue = new LinkedList<>();
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		queue.add(new Explore(x,y,distance));
		Visited[x][y] = true;
		while (!queue.isEmpty()) {
			Explore e = queue.poll();
			int a = e.x;
			int b = e.y;
			int new_distance = e.distance;
			if(a == N-1 && b == M-1)
				return new_distance;
			for(int i=0; i<4; i++) {
				int next_x = a + dx[i];
				int next_y = b + dy[i];
				if(Can_go(next_x,next_y) && !Visited[next_x][next_y]) {
					queue.add(new Explore(next_x,next_y,new_distance+1));
					Visited[next_x][next_y] = true;
				}
			}
		}
		return 0 ;
	}
	public static boolean Can_go(int x, int y) {
		if(x<0 || x>=N || y<0 || y>=M || Maze[x][y] ==0)
			return false;
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		Maze = new int[N][M];
		for(int i = 0 ; i<N ; i++) {
			String[] maze = br.readLine().split("");
			for(int j = 0 ; j<M ; j++) {
				Maze[i][j] = Integer.parseInt(maze[j]);
			}
		}
		Visited = new boolean[N][M];
		System.out.println(Maze_Run(0,0,1));
	}
}
