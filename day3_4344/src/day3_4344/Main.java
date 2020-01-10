package day3_4344;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		int c;
		int stNum;//학생수
		
		c = scan.nextInt();// 테스트케이스 수
		
		double[] output = new double[c];//최종 결과
		
		for(int i = 0; i < c; i++) {//테스트 케이스
			double count = 0;
			double sum = 0;//점수 모두 더함
			double avr = 0;//점수 평균
			
			stNum = scan.nextInt();// 학생 수 입력
			int[] score = new int[stNum];
			
			for(int j = 0; j < stNum; j++) {
				score[j] = scan.nextInt();// 학생 점수 입력
				sum += score[j];								
			}
			
			avr = (double)sum/stNum;
			
			for(int j = 0; j < stNum; j++) {
				if(avr < score[j]) count++;
			}			
			output[i] = count/stNum * 100.0;
			
		}
		
		for(int i = 0; i < c; i++) {
			System.out.printf("%.3f", Math.round(output[i]*1000)/1000.0);
			System.out.println("%");
		}
	}

}
