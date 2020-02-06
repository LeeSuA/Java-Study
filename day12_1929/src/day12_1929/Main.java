package day12_1929;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		List<Boolean> list = new ArrayList<>();
		list.add(false);
		list.add(false);
		
		for(int i = 2; i < n; i++) list.add(i, true);
		for(int i = 2; i*i <= n; i++) {
			if(list.get(i))
				for(int j = i*i; j <= n; j+=i)
					list.set(j, false);
		}
		
		for(int i = m; i <= n; i++) {
			if(list.get(i)) System.out.println(i);
		}
	}
	
	
}
