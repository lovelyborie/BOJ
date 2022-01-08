package EX_1978;
import java.util.Scanner;
public class Find_sosu {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		int input[] = new int[N];
		for(int i = 0 ; i<N ; i ++)
			input[i] = scan.nextInt();
	boolean[] sosu = new boolean[1001];
	sosu[0] = true; sosu[1] = true;
	int result = 0 ;
	for(int i = 2 ; i<sosu.length; i++) {
		if(sosu[i])
			continue;
		for(int j = i+i ; j<sosu.length;j=j+i) {
			sosu[j] = true;
		}
	}
	for(int k = 0 ; k<input.length; k++) {
		int target = input[k] ;
		if (!sosu[target]) {
			result++;
		}
	}
	System.out.println(result);
	}
}