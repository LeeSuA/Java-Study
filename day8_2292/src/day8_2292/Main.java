package day8_2292;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 , 2~7 / 8~19 / 20~37/ 38~61 -> 1 6 12 18 24
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = 0;
		for(int i = 1; i < n; i = i + 6*s) {
			s++;
		}
		System.out.println(s+1);

	}

}
