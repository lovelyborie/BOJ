package EX_1085;
import java.util.Scanner;
public class Rectangle_Escape {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x_w = 0 ; int y_h = 0;
		if (x>w/2)
			x_w = w-x;
		else
			x_w = x;
		if(y>h/2)
			y_h = h-y;
		else
			y_h = y;
		System.out.println(Math.min(x_w,y_h));
			
	}
}
