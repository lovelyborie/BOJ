package EX_1546;
import java.util.Scanner;
public class Average {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Max = -1; int whole=0;
		int score;
		for(int i = 0 ; i <N ; i++) {
			score = scan.nextInt();
			whole += score;
			if(score > Max)
				Max = score;
		}
		double Aver = 0;	
		Aver = 100.0 * whole / Max / N ;
		System.out.println(Aver);
	}
}
