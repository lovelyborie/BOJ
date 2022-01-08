package EX_2920;
import java.util.Scanner;
public class Music_scale {
	static int[] ascending;
	static int[] descending;
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		ascending =new int[]{1,2,3,4,5,6,7,8};
		descending =new int[]{8,7,6,5,4,3,2,1};
		int[] input = new int[8];
		for (int i = 0 ; i<input.length; i++)
			input[i] = scan.nextInt();
		String result = compare(input);
		System.out.println(result);
	}
	static String compare(int[] a) {
		if(a[0]!=8 && a[0]!=1)
			return "mixed";
		else if (a[0] == 1) {
		for(int i = 0 ; i<a.length; i++) {
			if(a[i] != ascending[i])
				return "mixed";
		}
		return "ascending";
		}
		else {
			for(int i = 0 ; i<a.length; i++) {
				if(a[i] != descending[i])
					return "mixed";
			}
			return "descending";
		}
	}
}
