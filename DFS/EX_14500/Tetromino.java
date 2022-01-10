package EX_14500;
import java.util.Scanner;

public class Tetromino {
	static int N,M,result; //����(x),����(y),���(�ִ밪)
	static int[][] field; //������ ���� ����
	static boolean[][] Visited;
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); //����Ʈ��
		N = scan.nextInt();
		M = scan.nextInt();
		field = new int [N][M];
		Visited = new boolean[N][M];
		result = 0;
		
		for (int i=0 ; i<N ; i++) { //���� �Է�
			for (int j=0; j<M ; j++) {
				field[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0 ; i<N ; i++) { //dfs�� ����üũ
			for (int j=0; j<M ; j++) {
				Visited[i][j] = true;
				dfs(i,j,1,field[i][j]);
				Visited[i][j] = false;
				except(i,j);
				}
			}
		
		System.out.println(result);
		
	}
	
	static void dfs (int x,int y,int depth,int sum) { //�̸�� ���� �Ѻױ׸���
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,1,-1};
		if (depth == 4) {
			result = Math.max(sum,result);
			return;
		}
		for(int i=0 ; i<4 ; i++) {
			int next_x = x + dx[i];
			int next_y = y + dy[i];
			if(!isok(next_x,next_y))
				continue;
			Visited[next_x][next_y] = true;
			dfs(next_x,next_y,depth+1,sum+field[next_x][next_y]);
			Visited[next_x][next_y] = false;
			
		}
	}
	
	static void except (int x,int y) { //�̸���� ��� ó�� (������ ��� ��� ���)
		int T = 0;
		if(x<N-2 && y<M-1) { //�� ���
			T = field[x][y] + field[x+1][y] + field[x+2][y] + field[x+1][y+1];
			result = Math.max(result,T);
			}
		if(x<N-2 && y>0) { // �� ���
			T = field[x][y] + field[x+1][y] + field[x+2][y] + field[x+1][y-1];
			result = Math.max(result,T);
			}
		if(x<N-1 && y<M-2) { // �� ���
			T = field[x][y] + field[x][y+1] + field[x][y+2] + field[x+1][y+1];
			result = Math.max(result,T);
		}
		if(x>0 && y<M-2) { // �Ǹ��
			T = field[x][y] + field[x][y+1] + field[x][y+2] + field[x-1][y+1];
			result = Math.max(result,T);
		}
	}
	
	static boolean isok (int x,int y) { //Ž�� ���� ���� Ȯ��
		if (x<0 || y<0 || x>=N || y>=M || Visited[x][y]) {
			return false;
		}
		else
			return true;
	}


}
