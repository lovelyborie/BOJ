package EX_1157;
import java.util.Scanner;
public class wordstudy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[26];
		String word = scan.nextLine();
		word = word.toLowerCase();
		int MAX = 0;
		int k=0;
		boolean draw = false;
		for(int i=0;i<word.length();i++)
			arr[word.charAt(i)-97]++; //아스키코드

		for(int i=0; i<arr.length;i++) {
			if(MAX<arr[i]) {
				MAX=arr[i];
				k = i;
				draw = false;
			}
			else if(MAX!=0 && MAX == arr[i])
				draw =true;
		}
		if(draw)
			System.out.println("?");
		else
			System.out.println(Character.toUpperCase((char)(k+97)));
		
	}
}
