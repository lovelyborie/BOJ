package EX_1003;
import java.util.Scanner;
public class fibo {
	static int T,N;
	static int a[][] = new int[41][2];
	public static void main(String[] args) {
		a[0][0] = 1; a[0][1] = 0; a[1][0] = 0; a[1][1] = 1;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for(int i =0; i<T;i++) {
			N= scan.nextInt();
			if(N>=2) {
			for(int j = 2; j<=N;j++) {
				a[j][0] = a[j-1][0] + a[j-2][0];
				a[j][1] = a[j-1][1] + a[j-2][1];
			}
		}
			System.out.println(a[N][0]+" "+a[N][1]);
		}
	}

}
