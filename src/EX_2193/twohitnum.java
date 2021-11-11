package EX_2193;
import java.util.Scanner;
import java.util.Arrays;

public class twohitnum {
	static int twochin[];
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		twochin= new int[91];
		twochin[1] = 1;
		twochin[2] = 1;
		twochin[3] = 2;
		for (int i =4 ; i<=N ; i++) {
			twochin[i] = twochin[i-2]+1;
		}
		System.out.println(twochin[N]);
	}

}
