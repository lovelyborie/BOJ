package EX_1436;
import java.util.Scanner;
public class Director_shum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sequence = 0 ;
		int number = 0 ;
		while (sequence < N) {
			number ++;
			if(String.valueOf(number).contains("666")) {
				sequence++;
			}
		}
		System.out.println(number);
	}
}
