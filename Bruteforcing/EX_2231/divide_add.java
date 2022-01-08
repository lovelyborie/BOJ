package EX_2231;
import java.util.Scanner;
public class divide_add {
	static int judge(int n) {
		for (int i = 1; i<n ; i++) {
			int test = i ;
			int sum = 0;
			while(test != 0) {
				sum += test % 10;
				test /= 10;
			}
			if(sum + i == n)
				return i ;

		}
		return 0;
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int result = judge(N);
		System.out.println(result);
	}
}
