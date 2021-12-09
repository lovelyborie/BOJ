package EX_2292;
import java.util.Scanner;
public class Bee_House {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int layer = 1 ;
		int num = 0 ;
		int totalNum = 1 ;
		while(true) {
			if(n<=totalNum)
				break;
			else {
				num += 6;
				totalNum+=num;
				layer++;
			}
		}
		System.out.println(layer);
	}
}
