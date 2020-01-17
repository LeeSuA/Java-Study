package day9_2869;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, v, answer = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		v = scan.nextInt();
		// (a-b)answer = v
		answer = (v-b) / (a-b); 
		if((v-b) % (a-b) != 0) answer++;
		System.out.println(answer);

	}

}
