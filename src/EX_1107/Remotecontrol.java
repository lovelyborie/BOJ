package EX_1107;
import java.util.Scanner;

public class Remotecontrol {
	static boolean broken[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t_c = scan.nextInt(); //Target_Channel
		int M = scan.nextInt(); //고장난 버튼 개수
		broken = new boolean[10]; //0~9까지 고장유무 조사
		for(int i = 0 ; i< M ; i++) {
			int k = scan.nextInt();
			broken[k] = true; 
			}//고장 유무 조사
		int best = Math.abs(t_c-100); //처음에는 100채널에있고 target까지 +1 혹은 -1을통해 해당채널까지 가는것을 최선으로 둔다
	    for(int i = 0 ; i<= 999999; i++) { //브루트포스 알고리즘  //채널이 500000까지 있으므로 범위 설정
	    	String move = String.valueOf(i); //숫자를 문자로 전환  //t_c로 한번에 이동하면 best // 버튼이 고장나 최대한 근처로 움직인후 +-1을이용해 최소버튼누르기 횟수를 찾는다
	    	int button = move.length(); //이동을 위해 몇개의 버튼을 눌렀는가
	    	boolean notok = false; //버튼이 부서지지않았다면 false 유지
	    	for (int j = 0 ; j<button; j ++) {
	    		if(broken[move.charAt(j)-'0']) { //작동이 안되는 버튼을 눌렀나 검사
	    			notok = true;
	    			break;
	    		}
	    		}
	    		if(!notok) { //검사 통과시 작업진행
	    			int result = Math.abs(t_c -i) + button; //버튼을 눌러 이동한 채널에서 +-1을 통해 target에 접근하는 횟수 + 이동한 채널로 가기위해 누른 버튼개수
	    			best = Math.min(best,result); //더 작은것으로 선택
	    		}
	    	
	    }
	   System.out.println(best);
	}
}

