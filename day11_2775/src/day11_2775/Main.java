package day11_2775;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		int arr[][] = new int[15][15];
		// 0�� 1ȣ = 1, 2ȣ = 2, 3ȣ = 3, 4ȣ = 4
		// 1�� 1ȣ = 1, 2ȣ = 3, 3ȣ = 6 4ȣ = 10
		// 2�� 1ȣ = 1, 2ȣ = 4, 3ȣ = 10 4ȣ = 20
		// 3�� 1ȣ = 1, 2ȣ = 5, 3ȣ = 15 4ȣ = 35
		// 4�� 1ȣ = 1, 2ȣ = 6, 3ȣ = 21 4ȣ = 56
		// ������ n-1ȣ + ���� nȣ
		for(int i = 0; i < 15; i++) {
			arr[i][0] = 1;
			arr[0][i] = i + 1;
		}
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int i = 0; i < t; i++) {//�׽�Ʈ���̽�
			int k = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(arr[k][n-1]);
			
			
		}
	}

}
