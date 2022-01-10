package EX_3052;
import java.util.Scanner;
public class Modulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] modu = new boolean[42]; //0~41
		int count = 0;
		for(int i=0 ; i<10; i++) {
			int input = scan.nextInt();
			int modulo = input % 42;
			if (!modu[modulo]) {
				modu[modulo] = true;
				count++;
			}
		}
		System.out.println(count);
	}
}
