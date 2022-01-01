package EX_2562;
import java.util.Scanner;
public class Max_Value {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[10];
		int Max = -1; int Max_index = -1;
		for (int i=1 ; i<10 ; i++) 
			nums[i] = scan.nextInt();
		for (int j=1; j<10 ; j++) {
			if (nums[j] > Max) {
				Max = nums[j];
				Max_index = j;
			}
		}
		System.out.println(Max);
		System.out.println(Max_index);
	}
}
