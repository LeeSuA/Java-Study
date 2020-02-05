package day11_2775;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		int arr[][] = new int[15][15];
		// 0층 1호 = 1, 2호 = 2, 3호 = 3, 4호 = 4
		// 1층 1호 = 1, 2호 = 3, 3호 = 6 4호 = 10
		// 2층 1호 = 1, 2호 = 4, 3호 = 10 4호 = 20
		// 3층 1호 = 1, 2호 = 5, 3호 = 15 4호 = 35
		// 4층 1호 = 1, 2호 = 6, 3호 = 21 4호 = 56
		// 같은층 n-1호 + 전층 n호
		for(int i = 0; i < 15; i++) {
			arr[i][0] = 1;
			arr[0][i] = i + 1;
		}
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int i = 0; i < t; i++) {//테스트케이스
			int k = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(arr[k][n-1]);
			
			
		}
	}

}
