package EX_1259;
import java.util.Scanner;
public class Palindrome_num {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int N = scan.nextInt();
			if (N == 0) {
				break;
			}
			int original = N ;
			int reverse = 0;
			while(N>0) {
				reverse = reverse * 10 + N%10;
				N /= 10;
			}
			if(original == reverse)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
