package EX_15829;

import java.io.*;
import java.util.*;

public class Hashing {
	static final int r=31;
	static final int M=1234567891;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L=Integer.parseInt(br.readLine());
		String s=br.readLine();
		long ans=0;
		for(int i=0;i<L;i++){
			ans+=(s.charAt(i)-'a'+1)*pow(r,i);
		}
		System.out.println(ans%M);
	}
	static long pow(int a,int b){
		return b==0?1:a*pow(a,b-1)%M;
	}
}
