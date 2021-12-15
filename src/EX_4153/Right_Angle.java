package EX_4153;
import java.util.Scanner;
public class Right_Angle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a==0 && b==0 && c==0) break;
			if((a*a+b*b == c*c) || (b*b+c*c == a*a) || (c*c+a*a==b*b))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
