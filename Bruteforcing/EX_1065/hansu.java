package EX_1065;
import java.util.Scanner;

public class hansu {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		if(N<100)
			System.out.println(N);
		else {
			int count = 99;
			for (int i = 100 ; i<=N ; i++) {
				if(judge(i))
					count++;
			}
			System.out.println(count);
		}
		
	}
	
	static boolean judge(int a) {
		int first = a/100;
		int second = a%100/10;
		int third = a%10;
		if(first - second == second - third)
			return true;
		return false;
		
	}
}
