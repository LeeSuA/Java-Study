package day12_1978;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int num = scan.nextInt();
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
			if (sosu == true)
				cnt++;
		}
		System.out.println(cnt);

	}

}
