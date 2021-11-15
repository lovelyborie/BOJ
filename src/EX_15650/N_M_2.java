package EX_15650;
import java.util.Scanner;
import java.util.Arrays;
public class N_M_2 {
	static int N,M;
	static boolean[] used;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		arr = new int[M];
		used = new boolean[9];
		Arrays.fill(used,false);
		N_M(0,1);
		System.out.println(sb.toString());
	}
	static void N_M (int count , int start) {
		if(count == M) {
			for(int i = 0 ; i<arr.length ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int j = start ; j<=N ; j++) { //j=1 부터한다면 중복이 발생한다.start부터 검토하기에 중복을 피할수있다.
			if(!used[j]) {
				arr[count] = j;
				used[j] = true; 
				N_M(count+1,j);
				used[j] = false;
			}
		}
		
	}
}
