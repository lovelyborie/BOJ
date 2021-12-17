package EX_10989;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num_Sort {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] nums = new int[N];
		int now = 0;
		for(int i = 0 ; i<N ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(nums);
		while (now<nums.length) {
			sb.append(nums[now]).append("\n");
			now++;
		}
		System.out.println(sb);
	}
}
