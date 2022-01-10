package EX_9461;
import java.util.Scanner;

public class Padoclass {
	static long pado[];
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int Test = scan.nextInt();
		pado = new long[101];
		pado[1] = 1;
		pado[2] = 1;
		pado[3] = 1;
		for (int i = 0 ; i<Test ; i++) {
			int N = scan.nextInt();
			System.out.println(makepado(N));
		}
	}
	
	static long makepado (int a) {
		for (int i = 4 ; i<=a ; i++) {
			pado[i] = pado[i-3] + pado[i-2];
		}
		return pado[a];
	}
}
