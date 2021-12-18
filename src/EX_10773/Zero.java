package EX_10773;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
public class Zero {
	static int total;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack <Integer> bill = new Stack<>();
		total = 0 ;
		for(int i = 0 ; i<K ; i++) {
			int hyun = Integer.parseInt(br.readLine());
			if (hyun == 0)
				bill.pop();
			else
				bill.push(hyun);
		}
		while(!bill.isEmpty()) {
			total += bill.pop();
		}
		System.out.println(total);
	}
}
