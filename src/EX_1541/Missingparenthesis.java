package EX_1541;

import java.util.Scanner;
public class Missingparenthesis {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next(); //�Է��� ������ ���ڿ��� ���
		String[] nominus = input.split("-"); //-�� ���� �迭�� ����
		//010-1234-5678�� ��� 
		/* nominus[0] = 010
		 * nominus[1] = 1234
		 * nominus[2] = 5678�� ����
		 */
		//-���� �� ���� - �������� �ѹ��� ��� ���ش�.
		int maxplus = 0; boolean first = true; int result = 0;
		for(int i = 0 ; i<nominus.length;i++) {
			String plus = nominus[i];
			String[] allplus = plus.split("\\+");
			maxplus = 0; //�߰��� �����༭ ���� ������ ��� ���ϴ� ���� �߻�
			for (int j = 0 ; j<allplus.length ; j++) {
				String oneplus = allplus[j];
				maxplus += Integer.parseInt(oneplus);
			}
			if(first) {
				maxplus = -1 *maxplus;
				//ó���� ������ +�̱⶧���̴�.
			}
			result -= maxplus;
			first = false;
			
		}
		System.out.println(result);
	}
}
