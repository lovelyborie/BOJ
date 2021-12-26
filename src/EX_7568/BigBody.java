package EX_7568;
import java.util.Scanner;
import java.util.Arrays;
public class BigBody {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] body = new int[N][2];
		int[] rank = new int[N];
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0; j<2 ; j++) {
				body[i][j] = scan.nextInt();
			}
		}
			Arrays.fill(rank,1);
			for(int a = 0 ; a<N ; a ++) {
				for(int b = 0; b<N ; b++) {
					if(body[a][0]<body[b][0]&&body[a][1]<body[b][1]) {
						rank[a]++;
					}
				}
				}

		for(int c = 0 ; c<N ; c++)
			System.out.print(rank[c]+" ");
	}
}
