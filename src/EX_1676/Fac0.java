package EX_1676;

import java.util.Scanner;
public class Fac0 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int zeronum = 0;
		while(input >=5) {
			zeronum += input/5;
			input /=5;
		}
		System.out.println(zeronum);
	}

}
