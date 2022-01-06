package EX_11279;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
public class Max_Heap {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //���갳��
		PriorityQueue<Integer> priorityqueue = new PriorityQueue<>(Collections.reverseOrder());
		//�켱������ ���� ��
		for(int i=0 ; i<N ; i++) {
			int command = scan.nextInt();
			if(command == 0) {
				if(priorityqueue.size() == 0)
					System.out.println("0");
				else {
					System.out.println(priorityqueue.poll());
				}
			}
			else {
				priorityqueue.add(command);
			}
				
		}
	}
}
