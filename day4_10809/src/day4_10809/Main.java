package day4_10809;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		int result[] = new int[26];
		char alp[] = new char[26];
		
		for(int i = 0; i < 26; i++) {
			alp[i] = (char)(97+i);
		}
		
		for(int i = 0; i < 26; i++) {
			result[i] = -1;
		}
		
		for(int j = 0; j < s.length(); j++) {
			
			for(int i = 0; i < 26; i++) {
				if(s.charAt(j) == alp[i]) {//문자열의 j번째 알파벳이 알파벳 i와일치
					if(result[i] == -1) {
						result[i] = j;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println(result[i]);
		}
	}

}
