package day13_1085;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int shortest = x;// x || y || w-x || h-y
		
		shortest = cmp(shortest, y);
		shortest = cmp(shortest, w-x);
		shortest = cmp(shortest, h-y);
		
		System.out.println(shortest);

	}
	public static int cmp(int a, int b) {
		if(a > b) return b;
		else return a;
	}

}
