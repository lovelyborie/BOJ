package EX_1074;

import java.util.Scanner;
public class Z {
	static int N,R,C,Count;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		R = scan.nextInt();
		C = scan.nextInt();
		int side =(int)Math.pow(2, N); //º¯±æÀÌ
		System.out.println(quadZ(side,0,0));
	}
	static int quadZ(int side,int r,int c) {
		if (side == 1)
			return 0 ;
		int newside = side/2 ;
		if(r+newside > R && c+newside > C)
			return quadZ(newside,r,c);
		else if(r+newside > R && c+newside <= C) 
			return quadZ(newside,r,c+newside)+(int)Math.pow(newside,2);
		else if(r+newside <= R && c+newside > C)
			return quadZ(newside,r+newside,c) + (int)Math.pow(newside,2)*2;
		else
			return quadZ(newside,r+newside,c+newside) + (int)Math.pow(newside,2)*3;
	}
}

