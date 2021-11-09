package EX_11727;
import java.util.Scanner;
import java.util.Arrays;


public class Tiling2_n_ver2 {
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
		int result;
		if(tile[n]!=-1)
			return tile[n];
		if(n==0)
			return 1;
		if(n-2>=0) {
			result1 = tiling(n-1)%10007;
			result2 = tiling(n-2)%10007;
		}
		else {
			result1 = tiling(n-1)%10007;
		}
		result = result1+result2*2;
		tile[n] = result;
		return result%10007;
	}
}