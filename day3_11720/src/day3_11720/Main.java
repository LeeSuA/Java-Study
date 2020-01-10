package day3_11720;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0, result = 0;		
		String str;

		num = scan.nextInt();
		scan.nextLine();
		str = scan.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			result = result + str.charAt(i) - '0';
		}
		
		System.out.println(result);
		
		scan.close();

	}

}
