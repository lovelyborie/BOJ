package EX_2193;
import java.util.Scanner;
import java.util.Arrays;

public class twohitnum {
	static long twochin[];
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		twochin= new long[91];
		twochin[1] = 1;
		twochin[2] = 1;
		twochin[3] = 2;
		for (int i =4 ; i<=N ; i++) {
			for(int j = 1 ; j<i-1; j++) {
				twochin[i] += twochin[j];
				if(j == i-2)
					twochin[i]+=1;
			}
		}
		System.out.println(twochin[N]);
	}

}
//�ִ� ��Ʈ �Ʒ��� ���� 0�ΰ�찡 �Ű�� �߰�
//�ִ� ��Ʈ �ٷ� �Ʒ� ��Ʈ�� 1�ΰ��� �Ұ����ϴ�. �� �Ʒ� ��Ʈ���� 1�ΰ�� �� �ڸ����� ������
//��ģ���� ��� �����ְ� ���������� ��� �ڸ��� 0 (�ִ� ��Ʈ����)�� ��츦 �����ָ� �ȴ�.
