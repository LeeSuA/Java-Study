package day15_1002;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i < test; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			int dis = (int) (Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
			int num = 0;// dis = 점 사이 거리
			int max = r1; 
			if(max < r2) max = r2;
			// dis = 중점 사이 거리 (int)Math.pow(r1 + r2, 2) = 반지름의 합
			// 중심이 같을 때 : 아예겹쳐짐, 만나지 않음/ 중심이 다를 때 : 외접, 내접, / 
			
			if(x1 == x2 && y1 == y2) {// 좌표(중점)가 같을 때
				if(r1 == r2) num = -1;// 아예 겹쳐짐
				else num = 0;
			}
			else if(dis > Math.pow(r1+r2, 2) || dis < Math.pow(r1-r2, 2)) num = 0;
			else if(dis == Math.pow(r1 - r2, 2) || dis == Math.pow(r1 + r2, 2)) num = 1;
			else num = 2;
			
			System.out.println(num);
		}

	}

}
