package ex6_random;

import java.util.Random; // ctrl + shift + O

public class Ex1_random {
	public static void main(String[] args) {
		
		//������ ������ִ� Ŭ���� Random
		Random rnd = new Random();
		
		//2~5 ������ ����
		//rnd.nextInt(������ ����) + ���ۼ�;
		//rnd.nextInt(����-���ۼ�+1)+���ۼ�;
		//int num = rnd.nextInt(4) + 2; 
		//2~5������� 2,3,4,5 4���̹Ƿ� ()�ȿ� 4 �Է�
		
		//12345~34567 ������ ����
		int num = rnd.nextInt( 34567 - 12345 + 1 ) + 12345;
		System.out.println(num);
		
		System.out.println("-------------------------------");
		
		//A ~ Z ������ ���ĺ��� �������� ��µǵ���
		
		
		int q = rnd.nextInt('Z'-'A'+1)+ 'A';
		System.out.println( (char)q ); // ����ȯ
		
		
		
		
		
		
	}//main

}
