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
//최대 비트 아래로 전부 0인경우가 매경우 추가
//최대 비트 바로 아래 비트가 1인것은 불가능하다. 그 아래 비트부터 1인경우 그 자릿수가 가지는
//이친수를 모두 더해주고 최종적으로 모든 자리가 0 (최대 비트제외)인 경우를 더해주면 된다.
