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
		use = new boolean[9]; // 1~8(최대)까지 사용여부 판단
		Arrays.fill(use, false); //처음에는 아무것도 사용하지않은 상태
		int [] arr = new int[M];
		m_n(N,M,0,sb,arr);
		System.out.println(sb.toString());		
	}
	static void m_n (int N,int M,int count,StringBuilder sb,int arr[]) {
		if(count == M) { //M개를 뽑았다면 종료
			for(int i = 0 ; i<arr.length ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n"); //줄바꿈 (1줄에 M개를 출력)
			return;
		}
		for (int j = 1 ; j<=N ; j++) {
			if(!use[j]) {
				use[j] = true; //사용했다 표시
				arr[count] = j ; //이번 순서에 넣어주기
				m_n(N,M,count+1,sb,arr); //이번순서를 기점으로 다음 순서입력
				use[j] = false; //모든 순서가 입력되면 다시 처음부터기에 사용하지않았다고 표시
			}
		}

			
	}
}
