package day4_2675;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int c;
		int r;
		String s;
		String S;
		
		c = scan.nextInt();
		for(int i = 0; i < c; i++){//테스트케이스
			S = "";
			r = scan.nextInt();
			scan.nextLine();
			s = scan.nextLine();
			for(int j = 0; j < s.length(); j++) {
				
				for(int k = 0; k < r; k++) {
					S = S + s.charAt(j);
				}
			}
            S = S.replaceAll(" ", "");
			System.out.println(S);			
		}		
	}

}
