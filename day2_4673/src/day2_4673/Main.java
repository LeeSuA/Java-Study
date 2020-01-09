package day2_4673;

public class Main {
	
	public static int d(int n) {
		
		int sum = n;
	
		while(n >= 1) {
			sum = sum + n % 10;
			n = n/10;		
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10000];
		for(int i = 0; i < 10000; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < 10000; i++) {
			for(int j = 0; j < 10000; j++) {
				if(d(i) == arr[j]) arr[j] = 0;
			}
		}
		
		for(int i = 0; i < 10000; i++)
			if(arr[i] != 0) System.out.println(arr[i]);
		
	}

}
