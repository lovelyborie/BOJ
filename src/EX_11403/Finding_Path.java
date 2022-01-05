package EX_11403;
import java.util.Scanner;
public class Finding_Path {
	static int N;
	static int[][] Map;
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		N = scan.nextInt();
		Map = new int[N][N];
		for(int i=0 ; i<N ; i++) { //연결입력
			for(int j=0 ; j<N ; j++) {
				Map[i][j] = scan.nextInt();
			}
		}
		Floyd_Warshall();
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				System.out.print(Map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void Floyd_Warshall(){
		//i->j 가능한가?
		//i->k->j 가능한가?
		for (int k=0 ; k<N ; k++) {
			for(int i=0; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					if(Map[i][k] == 1 && Map[k][j] == 1) {
						Map[i][j] = 1;
					}
				}
			}
		}
	}
}
