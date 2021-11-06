package EX_9095;
import java.util.Scanner;
import java.util.Arrays;
public class Plus1_2_3 {
	static int[] plus;
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	plus = new int[11];
	Arrays.fill(plus, -1);
	plus[0] = 1;
	for(int i = 0 ; i<T ; i++) {
		int Case = scan.nextInt();
		System.out.println(total(Case));
	}
	}
	static int total(int a) {
		int result1 = 0 ;
		int result2 = 0;
		int result3 = 0;
		int result=0;
		if(plus[a]!= -1)
			return plus[a];
		if(a>=3) {
			result1=total(a-1);
			result2=total(a-2);
			result3=total(a-3);
		}
		else if (a>=2) {
			result1 = total(a-1);
			result2 = total(a-2);
		}
		else
			result1 = total(a-1);
		result = result1+result2+result3 ;
		plus[a] = result;
		return result;
	}
}
