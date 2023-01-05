package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		//do-while : 선 처리, 후 비교
		//제어문들 중 유일하게 ;로 끝맺어야한다
		//do{
		//   조건식이 참일 떄 실행되는 영역
		//}while(조건식);
		
		int i = 11;
		do {
			System.out.println(i);
			//i++;
		}while(i<=10);
		
		System.out.println("----------------------------");
		
		//변수 java, jsp, android에 랜덤으로
		//0~130 사이의 값을 담는다
		//do-while을 통해 세 과목의 점수가 모두 0~100사이일 때만
		//while을 빠져나와 각 과목별 랜덤 성적을 출력
		
		//결과
		//자바 : 00	
		//jsp : 00
		//안드 : 00
		
		Random rnd = new Random();
		
		/*int java = rnd.nextInt(131) + 0;
		int jsp = rnd.nextInt(131) +0;
		int android = rnd.nextInt(131) +0;
		
		do {
			System.out.println(java);
		}while(java >100);
		
		do {
			System.out.println(jsp);
		}while(jsp >100);
		
		do {
			System.out.println(android);
		}while(android >100);
		
		
		System.out.println("java : "+java);
		System.out.println("jsp : "+jsp);
		System.out.println("android : " +android );
		*/
		
		int java = 0;
		int jsp = 0;
		int android = 0;
		
		
		do {
			
			java = rnd.nextInt(131);
			jsp = rnd.nextInt(131);
			android = rnd.nextInt(131); //do-while 안에 있으면 지역변수가 됨
			
		}while(java>100 || jsp>100 || android>100 );
		
		System.out.println("java : "+java);
		System.out.println("jsp : "+jsp);
		System.out.println("android : " +android );
			
		
		
	}//main

}
