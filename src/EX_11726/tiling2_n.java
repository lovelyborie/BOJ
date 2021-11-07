package EX_11726;
import java.util.Scanner;
import java.util.Arrays;

public class tiling2_n {
	static int tile[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		tile = new int[n+1];
		Arrays.fill(tile, -1);
		System.out.println(tiling(n));
		 
	}
	static int tiling(int n) {
		int result1=0;
		int result2=0;
		int result3=0;
		int result;
		if(tile[n]!=-1)
			return tile[n];
		if(n==0)
			return 1;
		if(n-2>=0) {
			result1 = tiling(n-1);
			result2 = tiling(n-2);
			result3 = tiling(n-2);
		}
		else {
			result1 = tiling(n-1);
		}
		result = result1+result2+result3;
		tile[n] = result;
		return result%10007;
	}
}
