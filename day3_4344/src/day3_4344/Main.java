package day3_4344;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		int c;
		int stNum;//�л���
		
		c = scan.nextInt();// �׽�Ʈ���̽� ��
		
		double[] output = new double[c];//���� ���
		
		for(int i = 0; i < c; i++) {//�׽�Ʈ ���̽�
			double count = 0;
			double sum = 0;//���� ��� ����
			double avr = 0;//���� ���
			
			stNum = scan.nextInt();// �л� �� �Է�
			int[] score = new int[stNum];
			
			for(int j = 0; j < stNum; j++) {
				score[j] = scan.nextInt();// �л� ���� �Է�
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
