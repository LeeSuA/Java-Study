package day11_1011;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			long dis = y - x;			
			long n = 0;
			
			while(n * n < dis) {// 2n-1횟수의 일때의 거리가 dis보다 커지면 중지.
				n++;
				if(n*n >= dis) break;				
			}
			if((n*n - n) >= dis) System.out.println(2 * n - 2);
			else System.out.println(2 * n - 1);		
		}
		
	}

}

