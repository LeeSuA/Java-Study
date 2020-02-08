package day14_3009;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dx = 0, dy = 0;
		int ax = scan.nextInt();
		int ay = scan.nextInt();
		int bx = scan.nextInt();
		int by = scan.nextInt();
		int cx = scan.nextInt();
		int cy = scan.nextInt();
		
		if(ax == bx) dx = cx;
		else if(ax == cx) dx = bx;
		else dx = ax;
		
		if(ay == by) dy = cy;
		else if(ay == cy) dy = by;
		else dy = ay;
		
		System.out.println(dx + " " + dy);

	}

}
