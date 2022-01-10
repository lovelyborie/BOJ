package EX_2579;
import java.util.Scanner;
import java.util.Arrays;

public class Stairs {
	static int points[];
	static int goal;
	static int  maxpoint[];
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		goal = scan.nextInt();
		points = new int [301];
		maxpoint = new int [301];
		Arrays.fill(maxpoint,-1);
		for (int i = 0 ; i<goal ; i++) {
			points[i+1]=scan.nextInt();
		}
		maxpoint[1] = points[1];
		maxpoint[2] = points[1]+points[2];
		maxpoint[3] = Math.max(points[1], points[2]) + points[3];
		for (int i =4 ; i <= goal ; i++)
			maxpoint[i] = Math.max(maxpoint[i-3]+points[i-1],maxpoint[i-2])+points[i];
		System.out.println(maxpoint[goal]);
	}
}	
	
	
	
	
	
	
	
	
	
	/*static int point(int now, int length) {
		int result=0;
		int result1=-1;
		int result2=-1;
		if(maxpoint[now]!= -1)
			return maxpoint[now];
		if(now == goal)
			return points[goal];
		if (length == 0) {
			result1 = point(now+1,1);
			if (goal != 1)
				result2 = point(now+2,1);
		}
		else if(now == goal-2 | length==2) {
			result2 = point(now+2,1);
			}
		else if(now == goal-1 ) {
				result1 = point(now+1,length+1);}
		else {
				result1 = point(now+1,length+1);
				result2 = point(now+2,1);
			}
		result = points[now]+Math.max(result1, result2);
		maxpoint[now] = result;
		return result;
	}	*/

