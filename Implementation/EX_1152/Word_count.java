package EX_1152;
import java.util.Scanner;
public class Word_count {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String words = scan.nextLine().trim();
		if(words.isBlank())
			System.out.println(0);
		else {
			String[] word = words.split(" ");
			System.out.println(word.length);
		}
	}
}
