package EX_2630;
import java.util.Scanner;

public class ColorPaper {
	static int paper[][]; //이차원배열
	static int whitenum;
	static int bluenum;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //가로세로
		int blocksize = scan.nextInt();
		paper = new int[blocksize][blocksize];
		for(int i = 0 ; i<blocksize ; i++) { // 이차원 배열로 색종이 생성
			for(int j = 0 ; j<blocksize ; j++) {
				paper[i][j] = scan.nextInt();
			}
		}
		compare(blocksize,0,0);
		System.out.print(whitenum);
		System.out.println(" ");
		System.out.print(bluenum);
	} 
	static void compare(int a,int x,int y) {
		if (a ==1) {
			if (paper[x][y] == 0)
					whitenum++;
			else
				bluenum++;
			return;
		}

	if(Same(a,x,y)) {
		return;
	}
	compare(a/2,x,y);
	compare(a/2,x+a/2,y);
	compare(a/2,x,y+a/2);
	compare(a/2,x+a/2,y+a/2);
}

	static boolean Same(int a,int x,int y) {
		int start = paper[x][y];
		for(int i =x ; i <x+a ; i++) {
			for(int j = y ; j<y+a ; j++) {
				if (start != paper[i][j])
					return false;
			}
		}
		if (start == 0)
			whitenum ++;
		else
			bluenum++;
		return true;
	}
	
}

