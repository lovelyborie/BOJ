package EX_1934;
import java.util.Scanner;
public class least_multiple {
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = scan.nextInt();
		for(int i =0; i<T ; i++) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			sb.append(first*second/GCD(first,second)).append("\n");
			
		}
		System.out.println(sb.toString());
	}
	
	public static int GCD (int first,int second) {
		int a = Math.max(first, second);
		int b = Math.min(first, second);
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
}
