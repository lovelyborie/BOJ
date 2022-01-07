package EX_10026;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Color_Weakness {
	static int N;
	static char[][] Map;
	static boolean[][] Visited;
	static Queue <Point> queue; //��ġ ���� ť
	
	static class Point { //ť�� ���� Map�� ��ġ�� �˷���
		int x,y;
		Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static boolean isOK(int x, int y) { //BFSŽ�� ����
		if(x<0 || x>=N || y<0 || y>=N)
			return false;
		return true;
	}
	
	static boolean SameColor(int x,int y,char color) { //������ �ƴѻ���� �� �Ǵ�
		if (Map[x][y] == color)
			return true;
		else
			return false;
	}
	
	static void Normal(int x,int y) { //���� BFS
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		char color = Map[x][y];
		Visited[x][y] = true;
		queue = new LinkedList<Point>();
		queue.add(new Point(x,y));
		while(!queue.isEmpty()) {
			Point Current = queue.poll();
			for(int i=0 ; i<4 ; i++) {
				int next_x = Current.x + dx[i];
				int next_y = Current.y + dy[i];
				if(isOK(next_x,next_y) && !Visited[next_x][next_y] && SameColor(next_x,next_y,color)) {
					Visited[next_x][next_y] = true;
					queue.add(new Point(next_x,next_y));
				}
			}
		}
	}
	
	public static void main (String[] args) throws Exception {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Map = new char[N][N];
		Visited = new boolean[N][N];
		int n_zone = 0; //����
		int c_zone = 0; //���ϻ���
		
		for (int i=0 ; i<N ; i++) { //Map����
			String[] line = br.readLine().split("");
			for (int j=0 ; j<N ; j++) {
				Map[i][j] = line[j].charAt(0);
			}
		}
		
		for (int i=0 ; i<N ; i++) { //������ �ƴѻ�� ���� ���� ������
			for (int j=0 ; j<N ; j++) {
				if(!Visited[i][j]) {
					Normal(i,j);
					n_zone++;
				}
			}
		}
		
		for (int i=0 ; i<N ; i++) { //������ ����� ���� Map ����
			for (int j=0 ; j<N ; j++) {
				if(Map[i][j] == 'G') {
					Map[i][j] = 'R';
				}
			}
		}
		
		Visited = new boolean[N][N]; //Arrays.fill�� ������� ���ϹǷ� �缱�� ���־ ��� false��
		
		for (int i=0 ; i<N ; i++) { //������ ��� ���� ���� ������
			for (int j=0 ; j<N ; j++) {
				if(!Visited[i][j]) {
					Normal(i,j);
					c_zone++;
				}
			}
		}
		
		System.out.print(n_zone +" ");
		System.out.print(c_zone);

		
	}
}
