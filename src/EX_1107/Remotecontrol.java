package EX_1107;
import java.util.Scanner;

public class Remotecontrol {
	static boolean broken[];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t_c = scan.nextInt(); //Target_Channel
		int M = scan.nextInt(); //���峭 ��ư ����
		broken = new boolean[10]; //0~9���� �������� ����
		for(int i = 0 ; i< M ; i++) {
			int k = scan.nextInt();
			broken[k] = true; 
			}//���� ���� ����
		int best = Math.abs(t_c-100); //ó������ 100ä�ο��ְ� target���� +1 Ȥ�� -1������ �ش�ä�α��� ���°��� �ּ����� �д�
	    for(int i = 0 ; i<= 999999; i++) { //���Ʈ���� �˰���  //ä���� 500000���� �����Ƿ� ���� ����
	    	String move = String.valueOf(i); //���ڸ� ���ڷ� ��ȯ  //t_c�� �ѹ��� �̵��ϸ� best // ��ư�� ���峪 �ִ��� ��ó�� �������� +-1���̿��� �ּҹ�ư������ Ƚ���� ã�´�
	    	int button = move.length(); //�̵��� ���� ��� ��ư�� �����°�
	    	boolean notok = false; //��ư�� �μ������ʾҴٸ� false ����
	    	for (int j = 0 ; j<button; j ++) {
	    		if(broken[move.charAt(j)-'0']) { //�۵��� �ȵǴ� ��ư�� ������ �˻�
	    			notok = true;
	    			break;
	    		}
	    		}
	    		if(!notok) { //�˻� ����� �۾�����
	    			int result = Math.abs(t_c -i) + button; //��ư�� ���� �̵��� ä�ο��� +-1�� ���� target�� �����ϴ� Ƚ�� + �̵��� ä�η� �������� ���� ��ư����
	    			best = Math.min(best,result); //�� ���������� ����
	    		}
	    	
	    }
	   System.out.println(best);
	}
}

