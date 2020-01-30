package day10_10250;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		int h, w, n;
		int room = 0;
		for(int i = 0; i < test; i++) {
			h = scan.nextInt();
			w = scan.nextInt();
			n = scan.nextInt();

			int high = 0, next = 0;
			
			for(int j = 0; j < n;) {
				j++;
				high = 1;
				next += 1;
				for(int k = 0; k < h-1; k++) {
					if(j >= n) break;
					j++;
					high+=1;
				}				
			}
			room = high * 100 + next;

			System.out.println(room);
		}

	}

}
