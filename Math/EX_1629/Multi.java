package EX_1629;
import java.util.Scanner;

public class Multi {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println(multi(A,B,C));
	}
	static long multi (int A,int B,int C) {
		if (B == 0)
			return 1;
		long k = multi(A,B/2,C);
		if(B%2 == 0)
			return k * k % C;
		else
			return(k * k % C) * A % C;		
	}
}
