package EX_10809;
import java.util.Scanner;
public class Find_Alpha {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		for (char i ='a' ; i<='z' ; i++) {
			System.out.print(word.indexOf(i)+" ");
		}
	}
}
