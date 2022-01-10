package EX_1463;
import java.util.Scanner;
import java.util.Arrays;
public class make_one {
	static int[] k;
	public static void main (String[] arg) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		k = new int[N+1];
		Arrays.fill(k, -1);
		System.out.println(make(N));
	}
	static int make(int x) {
		int result;
		if(k[x]!= -1) {
			return k[x];
		}
		if(x == 1)
			return 0 ;
		if(x%6==0) {
			result = Math.min(Math.min(make(x/3), make(x/2)),make(x-1))+1;

			}else if(x%2==0) {
				result = Math.min(make(x/2), make(x-1))+1;
			}else if(x%3==0) {
				result = Math.min(make(x/3),make(x-1))+1;
			}else {
				result = make(x-1)+1;
				}
		k[x] = result;
		return k[x];
	}
}

