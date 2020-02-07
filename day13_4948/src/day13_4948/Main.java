package day13_4948;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = 1;
		List<Boolean> list = new ArrayList<>();
		list.add(false);
		list.add(false);
		
		for(int i = 2; i <= 246912; i++) list.add(i, true);
		for(int i = 2; i*i <= 246912; i++) {
			if(list.get(i))
				for(int j = i*i; j <= 246912; j+=i) 
					list.set(j, false);
		}
		
		while(n != 0) {
			n = scan.nextInt();
			if(n == 0) break;
			int m = 2 * n;
			int cnt = 0;
			
			for(n = n+1; n <= m; n++) {
				if(list.get(n)) cnt++;
			}
			System.out.println(cnt);
		}

	}

}
