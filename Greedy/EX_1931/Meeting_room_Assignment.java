package EX_1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Meeting_room_Assignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int [][] time = new int[N][2];
		for(int i = 0 ; i<N ; i++) {
			time[i][0] = scan.nextInt();
			time[i][1] = scan.nextInt();
		}
		Arrays.sort(time,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1,int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int result = 0 ;
		int end_time = 0;
		for(int i = 0 ; i<N ; i++) {
			if(time[i][0]>=end_time) {
				end_time = time[i][1];
				result++;
			}
		}
		System.out.println(result);
	}
}
