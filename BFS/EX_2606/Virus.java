package EX_2606;
import java.util.Scanner;
import java.util.Arrays;

public class Virus {
	static boolean network[][];
	static boolean computer[];
	static int computernum;
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		computernum = scan.nextInt();
		network = new boolean[computernum+1][computernum+1];
		computer = new boolean[computernum+1];
		Arrays.fill(computer, false);
		int couple = scan.nextInt();
		for(int i =0 ; i<couple;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			network[a][b] = true;
			network[b][a] = true;
		}
		infection(network, 1);
		System.out.println(infectnum(computer)-1);//1Àº Á¦¿Ü				
	}
	
	static void infection(boolean[][]a,int start) {
		for(int i =1 ; i<=computernum ; i++) {
			if(a[start][i] && !computer[i]) {
				computer[i]=true;
				infection(a,i);
				}
		}
	}
	static int infectnum(boolean[]k) {
		int count=0;
		for(int i = 0 ; i<k.length; i++) {
			if(k[i])
				count++;				
		}
		return count;
	}
}
