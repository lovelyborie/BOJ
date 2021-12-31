package EX_2562;
import java.util.Scanner;
public class Max_Value {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[9];
		int Max = -1; int Max_index = -1;
		for (int i=0 ; i<9 ; i++) 
			nums[i] = scan.nextInt();
		for (int j=0; j<9 ; j++) {
			if (nums[j] > Max) {
				Max = nums[j];
				Max_index = j+1;
			}
		}
		System.out.println(Max);
		System.out.println(Max_index);
	}
}
