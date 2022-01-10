package EX_9084;
import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int TN = scan.nextInt(); //Test Number
		for(int i = 0 ; i<TN; i++) {
			int CN = scan.nextInt(); //Coin Number
			int coin[] = new int[CN];
			for(int j= 0 ; j<CN; j++) {
				coin[j] = scan.nextInt();
			}
			int total = scan.nextInt();
			int count[] = new int[total+1];
			count[0] = 1;
			for(int k = 0 ; k< CN ; k++) { //Coin 종류별로 한개씩
				for(int a=coin[k] ; a<=total ; a++) {
					count[a] += count[a-coin[k]];
					System.out.println(a);
				}
			}
			System.out.println(count[total]);
		}
	}
}
