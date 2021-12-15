package EX_11050;
import java.util.Scanner;
public class LeeHang1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		System.out.println(LeeHang(N,K));
	}
	public static int LeeHang(int N , int K) {
		return fact(N)/(fact(K)*fact(N-K));
	}
	public static int fact(int N) {
		if(N<=1)
			return 1;
		else
			return fact(N-1)*N;
	}
}