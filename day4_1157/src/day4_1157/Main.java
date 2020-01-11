package day4_1157;
import java.util.Scanner;
public class Main {// 65 97 -> 32

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word;
		
		int max = 0;
		int result[] = new int[26];
		char answer = '?';
		
		word = scan.nextLine().toUpperCase();
		
		for(int i = 0; i < word.length(); i++) {
			result[word.charAt(i)-65]++;
			if(max < result[word.charAt(i)-65]) {
				answer = word.charAt(i);
				max = result[word.charAt(i)-65];
			}
			
			else if(max == result[word.charAt(i)-65])
				answer = '?';
		}
		System.out.println(answer);
		
	}

}
