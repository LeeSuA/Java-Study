package day7_1712;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = 0;
		if(b >= c) x = -1;
		else x = a/(c-b) + 1;
		
		System.out.println(x);
		scan.close();

	}

}
