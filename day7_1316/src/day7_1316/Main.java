package day7_1316;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s;
		int cnt = 0;//그룹단어 수
		boolean alp[] = new boolean[26];
		
		boolean flag = false;
		
		for(int i = 0; i < n; i++) {//테스트케이스
			s = scan.nextLine();
			for(int j = 0; j < 26; j++) {alp[j] = false;}			
			for(int j = 0; j < s.length(); j++) {
				if(j > 0 && alp[s.charAt(j) - 'a'] == true && s.charAt(j) != s.charAt(j-1)) {
					flag = false;
					break;
				}
				else {alp[s.charAt(j) - 'a'] = true; flag = true;}
			}
			
			if(flag == true) cnt++;
		}
		
		System.out.println(cnt);

	}

}
