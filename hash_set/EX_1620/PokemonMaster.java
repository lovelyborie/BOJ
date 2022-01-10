package EX_1620;
import java.util.Scanner;
import java.util.HashMap;
public class PokemonMaster {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String[] pokemon = new String[N+1];
		HashMap<String,Integer> map = new HashMap<>(); //포켓몬이름,도감번호
		for(int i = 1 ; i <= N ; i ++) {
			pokemon[i]=scan.next();
			map.put(pokemon[i],i);}
		for(int i = 0 ; i < M ; i++) {
			String demand = scan.next();
			if(demand.charAt(0)<='9' && '0'<= demand.charAt(0)) {
				System.out.println(pokemon[Integer.parseInt(demand)]);
			}
			else {
				System.out.println(map.get(demand));
			}
		}
	}
}
