package day14_3053;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double n = scan.nextFloat();
		double ucl = n * n * Math.PI;
		double taxi = n * n * 2;
		
		System.out.printf("%.6f", ucl);
		System.out.println();
		System.out.printf("%.6f", taxi);

	}

}
