package EX_1389;
import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; //bfs구현을 위한 큐
import java.util.Arrays;
import java.util.Scanner;
public class Kevin_bacon {
	static int N,M,level;
	static boolean[] person;
	static boolean[][] know;
	static int[] levelcount;
	static int min,now,kevin;
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt(); M = scan.nextInt();
		level = -1;
		person = new boolean [101];
		know = new boolean [101][101];
		levelcount = new int[N+1];
		Arrays.fill(levelcount, 0);
		min = Integer.MAX_VALUE; now = 0;
		for (int i = 0 ; i<M ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			know[a][b] = true; know[b][a] = true;
		}
		for (int k = 1 ; k<=N ; k++) {
			bacongame(k);
			for(int h = 1 ; h<=N ; h++) {
				now +=levelcount[h];
			}
			if(now < min) {
				min = now;
				kevin = k;
			}
			Arrays.fill(person,false);
			Arrays.fill(levelcount, 0);
			now = 0;
		}
		System.out.println(kevin);
	}
	static void bacongame(int i) {
		Queue<bacon>queue = new LinkedList();
		queue.add(new bacon(i,0));
		person[i] = true;
		while(!queue.isEmpty()) {
			int name = queue.peek().name;
			int number = queue.poll().number;
			for(int j=1 ; j<=N ; j++){
				if(know[name][j]==true && person[j] == false) {
					queue.add(new bacon(j,number+1));
					levelcount[j] = number+1;
					person[j] = true;
				}
			}
		}
	}
	public static class bacon {
		int name;
		int number;
		bacon(int name,int number){
			this.name = name;
			this.number = number;
		}
	}
}
