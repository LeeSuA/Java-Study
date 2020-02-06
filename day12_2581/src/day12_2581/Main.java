package day12_2581;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0, min = 0;
		
		for (; m <= n; m++) {
			if (isSosu(m) == true) {
				if (sum == 0) min = m;
				sum += m;
				
			}

			
		}
		if (sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
	
	static boolean isSosu(int num) {
		boolean sosu = true;			

		if (num == 1)
			sosu = false;
		else if(num == 2)
			sosu = true;
		else {
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					sosu = false;
					break;
				}
			}
		}
		return sosu;
	}
}
