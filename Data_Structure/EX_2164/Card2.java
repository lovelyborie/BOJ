package EX_2164;
import java.util.LinkedList; //자바에서 큐선언을 위해 필요하다.
import java.util.Queue; 
import java.util.Scanner;
public class Card2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Queue<Integer>queue = new LinkedList<>();
		for(int i = 0 ; i<N ; i++) {
			queue.add(i+1);
		}
		while(queue.size()!=1) {
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
