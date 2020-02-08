package day14_4153;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if(a == 0 || b == 0 || c == 0) System.out.println("wrong");
			else if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
				System.out.println("right");
			else System.out.println("wrong");
		}

	}

}