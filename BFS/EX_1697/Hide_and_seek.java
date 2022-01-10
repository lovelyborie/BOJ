package EX_1697;

import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; //bfs구현을 위한 큐
import java.util.Arrays;
import java.util.Scanner;

public class Hide_and_seek {
	static boolean[] visit;
	static int brother;
	public static class position{
		int location;
		int seeknum;
		position(int location,int seeknum){
			this.location = location;
			this.seeknum = seeknum;
		}
	}
	static int seek(int start) {
			Queue<position>queue = new LinkedList();
			queue.add(new position(start,0));
			visit[start] = true;
			while(!queue.isEmpty()) {
				int location = queue.peek().location;
				int seeknum = queue.poll().seeknum;
				if (location == brother ) {
					return seeknum ;
				}
				for(int i = 0 ; i<3 ; i++) {
					if((location-1<0 && i ==0) | (location+1>100000 && i ==1) | (location*2 >100000 && i==2))
						continue;
					if(i == 0 && !visit[location-1]) {
						queue.add(new position(location-1,seeknum+1));
						visit[location-1] = true;
					}
					else if (i == 1 && !visit[location+1] && location+1<=100000) {
						queue.add(new position(location+1,seeknum+1));
						visit[location+1] = true;
					}
					else if (i==2 && !visit[location*2] && location*2<=100000) {
						queue.add(new position(location*2,seeknum+1));
						visit[location*2] = true;
					}
				}
			}
			return 0;
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int subin = scan.nextInt();
		brother = scan.nextInt();
		visit = new boolean [100001];
		if (subin >= brother)
			System.out.println(subin-brother);
		else
			System.out.println(seek(subin));
	}
}
