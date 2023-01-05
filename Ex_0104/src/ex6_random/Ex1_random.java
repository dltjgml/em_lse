package ex6_random;

import java.util.Random; // ctrl + shift + O

public class Ex1_random {
	public static void main(String[] args) {
		
		//난수를 만들어주는 클래스 Random
		Random rnd = new Random();
		
		//2~5 사이의 난수
		//rnd.nextInt(난수의 범위) + 시작수;
		//rnd.nextInt(끝수-시작수+1)+시작수;
		//int num = rnd.nextInt(4) + 2; 
		//2~5까지라면 2,3,4,5 4개이므로 ()안에 4 입력
		
		//12345~34567 사이의 난수
		int num = rnd.nextInt( 34567 - 12345 + 1 ) + 12345;
		System.out.println(num);
		
		System.out.println("-------------------------------");
		
		//A ~ Z 사이의 알파벳이 랜덤으로 출력되도록
		
		
		int q = rnd.nextInt('Z'-'A'+1)+ 'A';
		System.out.println( (char)q ); // 형변환
		
		
		
		
		
		
	}//main

}
