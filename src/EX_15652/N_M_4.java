package EX_15652;
import java.util.Scanner;

public class N_M_4 {
	static int N,M;
	static int arr[];
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		arr = new int[M];
		sb = new StringBuilder();
		n_m(0,1);
		System.out.println(sb.toString());
	}
	static void n_m(int count,int start) {
		if(count == M) {
			for(int i = 0 ; i<arr.length ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int k = start ; k<=N ; k++) {
			arr[count] = k;
			n_m(count+1,k);
		}
	}
}
