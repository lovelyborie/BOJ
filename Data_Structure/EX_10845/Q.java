package EX_10845;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Q {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer>queue = new LinkedList<>();
		int N = scan.nextInt();
		int i = 0 ;
		int a = 0 ;
		for(int k = 0 ; k<N; k++) {
			String command = scan.next();
			if(command.contains("push")) {
				a = scan.nextInt();
				queue.add(a);
			}
			else if (command.contains("pop")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.poll());
			}
			else if(command.contains("size")) {
				System.out.println(queue.size());
			}
			else if (command.contains("empty")) {
				if(queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if (command.contains("front")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.peek());
			}
			else if (command.contains("back")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(a);
			}
		}
	}
}
