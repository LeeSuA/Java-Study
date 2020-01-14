package day6_2941;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.nextLine();
		int sum = 0;//
		for(int i = 0; i < s.length(); i++) {			
			sum+=1;// 크로아티아 x
			
			if(i < s.length()-1 && s.charAt(i) == 'c') {				
				if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
					i++;
				}
			}
			else if(i < s.length()-1 && s.charAt(i) == 'd') {
				if(s.charAt(i+1) == '-') {
					i++;
				}
				else if(i < s.length()-2 && s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
					i += 2;
				}				
			}
			else if(i < s.length()-1 && s.charAt(i) == 'l') {
				if(s.charAt(i+1) == 'j') {
					i++;
				}				
			}
			else if(i < s.length()-1 && s.charAt(i) == 'n') {
				if(s.charAt(i+1) == 'j') {
					i++;
				}
			}
			else if(i < s.length()-1 && s.charAt(i) == 's') {
				if(s.charAt(i+1) == '=') {
					i++;
				}
			}
			else if(i < s.length()-1 && s.charAt(i) == 'z') {
				if(s.charAt(i+1) == '=') {
					i++;
				}
			}			
		}
		System.out.println(sum);
	}
}
