package EX_1764;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class noseenolisten {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		ArrayList<String> result = new ArrayList<>();
		HashSet<String> set = new HashSet<>();
		for(int i = 0 ; i<N ; i++) {
			String name = scan.next();
			set.add(name);
		}
		for(int j = 0 ; j<M ; j++) {
			String heard = scan.next();
			if(set.contains(heard)) {
				result.add(heard);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for(String s : result)
			System.out.println(s);
	}
}
