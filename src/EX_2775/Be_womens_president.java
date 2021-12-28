package EX_2775;
import java.util.Scanner;
public class Be_womens_president {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[][] people = new int[15][15];
		int[] result = new int[T];
		for (int i = 1 ; i<15 ; i++)
			people[0][i] = i;
		for(int floor=1; floor<15; floor++) {
			for(int room =1; room<15; room++) {
				people[floor][room] = people[floor][room-1]+people[floor-1][room];
			}
		}
		for(int i = 0 ; i<T; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			result[i] = people[k][n];
		}
		for (int i = 0 ; i<T ; i++)
			System.out.println(result[i]);
	}
}
