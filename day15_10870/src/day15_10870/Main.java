package day15_10870;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fib(n));

	}
	public static int fib(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 1;
		else return fib(n-1) + fib(n-2);
	}

}
