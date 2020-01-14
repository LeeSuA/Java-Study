package day6_5622;
import java.util.Scanner;

public class Main {
	static int time(char a) {
		if(a == 'A' || a == 'B' || a == 'C') return 3;
		else if(a == 'D' || a == 'E' || a == 'F') return 4;
		else if(a == 'G' || a == 'H' || a == 'I') return 5;
		else if(a == 'J' || a == 'K' || a == 'L') return 6;
		else if(a == 'M' || a == 'N' || a == 'O') return 7;
		else if(a == 'P' || a == 'Q' || a == 'R' || a == 'S') return 8;
		else if(a == 'T' || a == 'U' || a == 'V') return 9;
		else if(a == 'W' || a == 'X' || a == 'Y' || a == 'Z') return 10;
		else return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum = sum + time(s.charAt(i));
		}
		System.out.println(sum);
		
		
	}

}
