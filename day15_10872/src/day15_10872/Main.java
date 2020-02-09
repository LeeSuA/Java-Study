package day15_10872;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fac(n));
		

	}
	public static int fac(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return n * fac(n-1);
		
	}

}
