package day6_1152;
import java.util.Scanner;
// s�� �Է¹޴´�.
// s�� �յ� ���� ����trim()���
// s�� ���ڿ� �������� ������
// s�� ���ڸ� �˻��� ������ �� ������ ������ ������ num++
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s;
		int num;
		
		s = scan.nextLine();
		s = s.trim();
		
		if(s.length() == 0) num = 0;
		else num = 1;
		
		for(int i = 0; i < s.length() - 1; i++) {			
			if(s.charAt(i) != ' ' && s.charAt(i+1) == ' ') {
				num++;
			}
		}		 
		System.out.println(num);
	}
}
