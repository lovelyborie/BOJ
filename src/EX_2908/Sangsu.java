package EX_2908;
import java.util.Scanner;
public class Sangsu {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int A  = scan.nextInt();
		int B = scan.nextInt();
		A = reverse(A); 
		B = reverse(B);
		System.out.println(Math.max(A, B));
	}
	
	static int reverse (int a) {
		String number = String.valueOf(a);
		StringBuffer sb = new StringBuffer(number);
		sb = sb.reverse();
		int rev = Integer.parseInt(sb.toString());
		return rev;
	}
}
