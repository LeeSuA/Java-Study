package day13_9020;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		List<Boolean> sosu = new ArrayList<>();
		sosu.add(false);
		sosu.add(false);
		for(int i = 2; i <= 10000; i++) sosu.add(i, true);
		for(int i = 2; i*i <= 10000; i++) {
			if(sosu.get(i)) {
				for(int j = i*i; j <= 10000; j += i)
					sosu.set(j, false);
			}
		}
			
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a = 0, b = 1;
			boolean flag = true;
			for(int j = 1; j < n; j++) {				
				if(sosu.get(j) && sosu.get(n - j)) {
					if(n-j <= j) {
						a = j;
						b = n - j;
						break;
					}
				}
			}
			System.out.println(b + " " + a);
			
		}

	}

}
