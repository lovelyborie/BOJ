package EX_2869;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class snail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		//System.out.println(V/(A-B)); //남은 블럭처리에서 걸림
		//A-B보다 작은 잔여 블럭이 있다면 하루 추가
		int climb = (V-B)/(A-B);
		if ((V-B)%(A-B) != 0)
			climb++;
		System.out.println(climb);
	}
}
