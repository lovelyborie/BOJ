package EX_2839;
import java.util.Scanner;
public class sugar_deliever {
	static int count = 0;;
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		deliever(N);
		System.out.println(count);
	}
	
	static void deliever(int a) {
		if (a%5 == 0)
			count += a/5 ;
		else {
			count += 1 ;
			deliever(a-3);
		}
		if(a<0)
			count = -1;
	}
}
