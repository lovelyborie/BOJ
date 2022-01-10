package EX_1541;

import java.util.Scanner;
public class Missingparenthesis {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next(); //입력을 한줄의 문자열로 취급
		String[] nominus = input.split("-"); //-를 떼고 배열에 저장
		//010-1234-5678의 경우 
		/* nominus[0] = 010
		 * nominus[1] = 1234
		 * nominus[2] = 5678로 저장
		 */
		//-부터 그 다음 - 전까지를 한번에 묶어서 빼준다.
		int maxplus = 0; boolean first = true; int result = 0;
		for(int i = 0 ; i<nominus.length;i++) {
			String plus = nominus[i];
			String[] allplus = plus.split("\\+");
			maxplus = 0; //추가를 안해줘서 이전 값에서 계속 더하는 오류 발생
			for (int j = 0 ; j<allplus.length ; j++) {
				String oneplus = allplus[j];
				maxplus += Integer.parseInt(oneplus);
			}
			if(first) {
				maxplus = -1 *maxplus;
				//처음은 무조건 +이기때문이다.
			}
			result -= maxplus;
			first = false;
			
		}
		System.out.println(result);
	}
}
