package day1_1546;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		double max = 0.0;
		double temp = 0.0;
		
		n = scan.nextInt();
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(max < arr[i]) max = arr[i]; 
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = arr[i] * 100 / max ;
			temp = temp + arr[i];
		}
		
		double average = temp / n;
		System.out.println(average);
		
		scan.close();
	}

}
