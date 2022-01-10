package EX_10866;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deck {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i < N; i++) {
            String a = sc.next();
            if(a.equals("push_back")) {
                int b = sc.nextInt();
                deque.addLast(b);
            }else if(a.equals("push_front")) {
                int b = sc.nextInt();
                deque.addFirst(b);
            }else if(a.equals("pop_front")) {
                System.out.println(deque.isEmpty()? -1 : deque.pollFirst());
            }else if(a.equals("pop_back")) {
                System.out.println(deque.isEmpty()?-1:deque.pollLast());
            }else if(a.equals("size")) {
                System.out.println(deque.size());
            }else if(a.equals("empty")) {
                System.out.println(deque.isEmpty()?1:0);
            }else if(a.equals("front")) {
                System.out.println(deque.isEmpty()?-1:deque.peekFirst());
            }else if(a.equals("back")) {
                System.out.println(deque.isEmpty()?-1:deque.peekLast());
            }
        }
    }
}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main {	

	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	Deque<Integer> deque = new ArrayDeque<>();
    	int N = Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<N;i++) {
    		String[] arr = br.readLine().split(" ");
    		switch (arr[0]) {
    			case "push_front" : deque.offerFirst(Integer.parseInt(arr[1])); break;
    			case "push_back" : deque.offerLast(Integer.parseInt(arr[1])); break;
    			case "pop_front" : 
    				if(deque.isEmpty())
    					sb.append(-1 + "\n");
    				else
    					sb.append(deque.pollFirst() + "\n");
    				break;
    			case "pop_back" : 
    				if(deque.isEmpty())
    					sb.append(-1 + "\n");
    				else
    					sb.append(deque.pollLast() + "\n");
    				break;
    			case "size" : sb.append(deque.size() + "\n"); break;
    			case "empty" :
    				if(deque.isEmpty())
    					sb.append(1 + "\n");
    				else
    					sb.append(0 + "\n");
    				break;
    			case "front" :
    				if(deque.isEmpty())
    					sb.append(-1 + "\n");
    				else
    					sb.append(deque.peekFirst() + "\n");
    				break;
    			case "back" :
    				if(deque.isEmpty())
    					sb.append(-1 + "\n");
    				else
    					sb.append(deque.peekLast() + "\n");
    				break;    				
    		}
    	}
    	System.out.println(sb);
    }
}*/
