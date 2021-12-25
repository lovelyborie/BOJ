package EX_2609;
import java.util.Scanner;

public class pledge_multiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int pledge = gcd(a,b);
		int multiple = (a*b)/pledge;
		System.out.println(pledge);
		System.out.println(multiple);
	}
	static int gcd (int a , int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
}
