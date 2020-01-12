package day6_2908;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String ans;
		
		if(s1.charAt(2) > s2.charAt(2)) ans = s1;
		else if(s1.charAt(2) == s2.charAt(2)) {
			if(s1.charAt(1) > s2.charAt(1)) ans = s1;
			else if(s1.charAt(1) == s2.charAt(1)) {
				if(s1.charAt(0) > s2.charAt(0)) ans = s1;
				else if(s1.charAt(0) == s2.charAt(0)) ans = s1; 
				else ans = s2;
			}
			else ans = s2;
		}
		else ans = s2;
		
		for(int i = ans.length() - 1; i >= 0; i--) {
			System.out.print(ans.charAt(i));
		}

	}
}
