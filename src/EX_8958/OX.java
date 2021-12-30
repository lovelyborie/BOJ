package EX_8958;
import java.util.Scanner;
public class OX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[] score = new int[T];
		for (int i=0 ; i<T ; i++) {
			String ans = scan.next();
			int correct = 0;
			for (int j = 0 ; j<ans.length() ; j++) {
				if (ans.charAt(j)=='O') {
					correct++;
				}else
					correct = 0;
			score[i]+=correct;
			}
		}
		for (int i : score)
			System.out.println(i);
	}
}
