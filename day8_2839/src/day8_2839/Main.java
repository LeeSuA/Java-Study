package day8_2839;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int f = 0, t = 0;
		int result;

		f = n / 5;
		if(n % 5 == 0) {
			result = f;
		}
		else if(n % 5 == 1) {
			f-=1;
			t+=2;
		}
		else if(n % 5 == 2) {
			f-=2;
			t+=4;
		}
		else if(n % 5 == 3) {
			t+=1;
		}
		else if(n % 5 == 4) {
			f-=1;
			t+=3;
		}
		result = f + t;
		
		if(f < 0 || t < 0 || 5*f + 3*t != n) {
			result = -1;
		}
		System.out.println(result);
	}

}
