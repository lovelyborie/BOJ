package EX_5086;
import java.util.Scanner;
public class multiple_factor {
	static String result = "";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			if (first == 0 && second == 0)
				break;
			mf(first,second);
			System.out.print(result+"\n");
		}
	}
	static void mf(int first,int second) {

		if(first % second ==0) 
			result = "multiple";
		else if (second % first == 0)
			result = "factor";
		else
			result = "neither";
	}
	
}
