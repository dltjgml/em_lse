package ex5_printf;

public class Ex1_formater {
	public static void main(String[] args) {
		
		//포매터 : 사용할 데이터의 결과를 원하는 구조로 출력 가능하게 해주는 문법
		
		//오늘은 23년 01월 05일 입니다.
		
		int year = 23;
		int month = 1;
		int day = 5;
		
		System.out.println("오늘은 " + year +"년 " + month + "월 " + day + "일 입니다." );
		System.out.printf("오늘은 %d년 %02d월 %02d일 입니다.\n", year, month, day); //앞부터 순차적으로 자리 채워짐
		//%d 사이에 02 -> 숫자를 2자리로 만들어줌(01, 02, 03 .. 15)
		//        03 -> 숫자를 3자리로 만들어줌 (001, 002, 003... 123)
		
		//오늘의 날씨는 13.5도입니다
		
		System.out.printf("오늘의 날씨는 %.1f도 입니다.\n", 13.5f);//%f 사이에 .1 -> 소수점 한자리까지 표기할래요
		
		//저는 A형입니다.
		char bt = 'A';
		System.out.printf("저는 %c형 입니다.\n", bt);
		
		//제 이름은 홍길동입니다.
		System.out.printf("제 이름은 %s입니다\n", "홍길동");
		
		//오늘은 100% 이해 했습니다.
		System.out.printf("오늘은 %d%% 이해 했습니다.\n", 100);
		
		//1) %d : 정수(int, long, byte)
		//2) %f : 실수(float, double)
		//3) %c : 문자(char)
		//4) %s : 문자열(string)
		//5) %% : %기호를 출력하려는 목적
		
		
		
		
		
		
		
		
		
		
	}//main

}
