package EX_11047;
import java.util.Scanner;
public class Coin0 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int count = 0 ;
		int value [] = new int[N];
		for(int i = 0 ; i<N ; i++)
			value[i] = scan.nextInt();
		for(int i = N-1 ; i>=0 ; i--) {
			if(K>=value[i])
				count += K /value[i];
			K = K%value[i];			
		}
		System.out.println(count);
	}
}
