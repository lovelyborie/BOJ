package EX_1927;

import java.util.Scanner;
import java.util.PriorityQueue;
public class Min_Heap {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int attempt = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		while (attempt < N) {
			int command = scan.nextInt();
			if(command == 0) {
				if(queue.isEmpty()){
					System.out.println(0);
				}
				else {
					System.out.println(queue.poll());
				}
			}
			else {
				queue.add(command);
			}
			attempt ++;
		}
	}
}
