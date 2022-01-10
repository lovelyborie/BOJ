package EX_1780;

import java.util.Scanner;
import java.util.Arrays;
public class Number_of_Paper {
	static int[][] paper;
	static int[] papercount;
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		paper = new int[N][N];
		papercount = new int[3];
		Arrays.fill(papercount,0);
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				paper[i][j] = scan.nextInt()+1;
			}
		}
		research(0,0,N);
		for (int k : papercount)
			System.out.println(k);
	}
	
	
	static boolean isSameValue (int x,int y,int slide) { //slide = 한변길이
		int value = paper[x][y];
		for (int i = x ;i< x+slide ; i++ ) {
			for (int j = y ; j< y+slide ; j++ ) {
				if(value != paper[i][j])
					return false;
			}
		}
		return true;
	}
	
	static void research (int x, int y ,int slide) {
		if(isSameValue(x,y,slide)) {
			papercount[paper[x][y]] +=1;
		}
		else {
			slide = slide / 3 ;
			for(int i = 0 ; i<3 ; i++) {
				for(int j = 0 ; j<3 ; j++) {
					research(x+slide *i ,y+slide*j,slide);
				}
			}
		}
	}
}
