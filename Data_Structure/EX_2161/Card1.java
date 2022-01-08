package EX_2161;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card1 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1 ; i<=N ; i++) 
			queue.add(i);
		while(queue.size() != 1) {
			System.out.println(queue.poll());
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());	
		}
	}
