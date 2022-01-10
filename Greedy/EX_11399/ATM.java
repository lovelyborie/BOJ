package EX_11399;
import java.util.Arrays;
import java.util.Scanner;
public class ATM {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int total[] = new int[N];
		for(int i = 0 ; i<N ; i++) {
			total[i] = scan.nextInt();
		}
		Arrays.sort(total);
		System.out.println(atm(total));
		
	}
	static int atm(int[] a) {
		int wait = 0;
		int wait_do = 0;
		for (int i = 0 ; i<a.length;i++) {
			wait += a[i];  //���� ����ð���ŭ �߰��Ͽ� �� ���ʴ� ��ٸ�
			wait_do += wait; //�ռ� ����ð�+���μ���ð�
		}
		return wait_do;
	}
}
