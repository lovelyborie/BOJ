package EX_2798;
import java.util.Scanner;
import java.util.Arrays;
public class BlackJack {
	static int N,M,result;
	static int[] cards;
	static boolean[] Visit;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt(); M = scan.nextInt();
		cards = new int[N];
		for(int i = 0 ; i<N ; i++) {
			cards[i] = scan.nextInt();
		}
		Visit = new boolean[N];
		result = 0;
		search(0,0,0);
		System.out.println(result);
	}
	static void search(int index,int count,int sum) {
		if (count == 3) {
			if (sum <= M && result < sum )
				result = sum;
			return;
		}
		for(int a = index ; a<N ; a++) {
			if(!Visit[a]) {
				Visit[a] = true;
				search(a,count+1,sum+cards[a]);
				Visit[a] = false;
			}
		}
	}
}
