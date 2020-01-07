import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] rem = new int[10];
		int cnt = 10;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < rem.length; i++) {
			rem[i] = arr[i] % 42;			
		}
		
		for(int i = 0; i < rem.length; i++) {
			for(int j = i+1; j < rem.length; j++) {
				if(rem[i] == rem[j]) {
					cnt--;
					break;
				}				
			}
		}
		
		System.out.println(cnt);
		scan.close();
	}

}
