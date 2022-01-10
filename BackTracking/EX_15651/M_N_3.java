package EX_15651;
import java.util.Arrays;
import java.util.Scanner;



public class M_N_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int arr[] = new int[M];
		StringBuilder sb = new StringBuilder();
		making(arr,N,M,0,sb);
		System.out.println(sb.toString());
	}
	
	static void making(int[] arr, int N, int M, int number, StringBuilder sb ) {
		if(number == M) {
			for(int i =0; i < arr.length ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i =1; i<=N ; i++){
			arr[number] = i;
			making(arr,N,M,number+1,sb);
		}
		
	}
}
