package EX_2667;
import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; //bfs구현을 위한 큐
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class APT_num {
	static int[][] APT;
	static boolean[][] Visited;
	static int apt_count;
	static int[] apt_num;
	static int N;
	static ArrayList<Integer>res = new ArrayList<Integer>();
	public static class Explore {
		int x,y,count;
		Explore(int x,int y,int count){
			this.x = x;
			this.y = y;
			this.count = count;
		}		
	}
	public static int APT_Explore (int x, int y , int count) {
		Queue<Explore>queue = new LinkedList<>();
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		int c = 0;
		int number = 1;
		queue.add(new Explore(x,y,count));
		Visited[x][y] = true;
		while(!queue.isEmpty()) {
			Explore e = queue.poll();
			int a = e.x;
			int b = e.y;
			c = e.count;
			for(int i = 0 ; i<4 ; i++) {
				int next_x = a+dx[i];
				int next_y = b+dy[i];
				if(isAPT(next_x,next_y)&&!Visited[next_x][next_y]) {
					queue.add(new Explore(next_x,next_y,c+1));
					number++;
					Visited[next_x][next_y] = true;
				}
			}
		}
		return number;
	}
	public static boolean isAPT(int x, int y) {
		if(x<0 || x>=N || y<0 || y>=N || APT[x][y] ==0)
			return false;
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(str[0]);
		APT = new int[N][N];
		apt_num = new int[N*N];
		apt_count = 0;
		
		for(int i = 0 ; i<N ; i++) {
			String[] line = br.readLine().split("");
			for(int j = 0 ; j<N ; j++)
				APT[i][j] = Integer.parseInt(line[j]);
			}
		Visited = new boolean[N][N];
		for (int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N; j++) {
				if(APT[i][j] ==1 && !Visited[i][j]) {
					res.add(APT_Explore(i,j,1));
					apt_count++;
				}
			}
		}
		res.sort(null);
		System.out.println(apt_count);
        for (int x : res) 
            sb.append(Integer.toString(x) + '\n');
        System.out.println(sb);
	}
}
