package day2_1065;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		n = scan.nextInt();
		
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			if(han(i) == true) result++;
		}
		
		System.out.println(result);
	}
	
	public static boolean han(int n) {
		int a = n;
		if(n < 10) {
			return true;
		}
		
		else if(10 <= n && n < 100) {
			return true;
		}
		
		else if(n == 1000) return false;
		
		else {
			int x = n % 10;// 1의자리
			int y = (n / 10) % 10; // 10의자리
			int z = n / 100 % 10; // 100의자리
			if((y - x) == (z - y)) return true;
			else return false;
			
		}
	}

}


