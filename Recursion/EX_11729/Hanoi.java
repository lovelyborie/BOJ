package EX_11729;
import java.util.Scanner;
public class Hanoi { //n-1���� �߾����� �̵��ϰ� 1���� end �������� �ٽ� ������
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pane = scan.nextInt();
		System.out.println((int)Math.pow(2,pane)-1);
		recur(pane,1,2,3);
		System.out.println(sb.toString());
	}
	static StringBuilder sb = new StringBuilder();
	static void recur(int i,int start,int middle,int end) {
		if(i==1)
			sb.append(start).append(" ").append(end).append("\n");
		else {
			recur(i-1,start,end,middle);
			sb.append(start).append(" ").append(end).append("\n");
			recur(i-1,middle,start,end);
		}
	}
}
