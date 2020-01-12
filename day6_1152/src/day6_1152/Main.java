package day6_1152;
import java.util.Scanner;
// s를 입력받는다.
// s의 앞뒤 공백 제거trim()사용
// s를 문자와 공백으로 나눈다
// s의 문자를 검사해 문자인 것 다음에 공백이 나오면 num++
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s;
		int num;
		
		s = scan.nextLine();
		s = s.trim();
		
		if(s.length() == 0) num = 0;
		else num = 1;
		
		for(int i = 0; i < s.length() - 1; i++) {			
			if(s.charAt(i) != ' ' && s.charAt(i+1) == ' ') {
				num++;
			}
		}		 
		System.out.println(num);
	}
}
