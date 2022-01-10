package EX_15649;
import java.util.Scanner;
import java.util.Arrays;
public class N_M_1 {
	static int N;
	static int M;
	static boolean[] use;
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = scan.nextInt();
		M = scan.nextInt();
		use = new boolean[9]; // 1~8(�ִ�)���� ��뿩�� �Ǵ�
		Arrays.fill(use, false); //ó������ �ƹ��͵� ����������� ����
		int [] arr = new int[M];
		m_n(N,M,0,sb,arr);
		System.out.println(sb.toString());		
	}
	static void m_n (int N,int M,int count,StringBuilder sb,int arr[]) {
		if(count == M) { //M���� �̾Ҵٸ� ����
			for(int i = 0 ; i<arr.length ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n"); //�ٹٲ� (1�ٿ� M���� ���)
			return;
		}
		for (int j = 1 ; j<=N ; j++) {
			if(!use[j]) {
				use[j] = true; //����ߴ� ǥ��
				arr[count] = j ; //�̹� ������ �־��ֱ�
				m_n(N,M,count+1,sb,arr); //�̹������� �������� ���� �����Է�
				use[j] = false; //��� ������ �ԷµǸ� �ٽ� ó�����ͱ⿡ ��������ʾҴٰ� ǥ��
			}
		}

			
	}
}
