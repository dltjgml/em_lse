package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//casting(형변환)
		//서로 다른 자료형 간에 값을 주고받기 위한 문법(개념)
		
		//1.promotion 
		// - 큰 자료형에 작은 자료형을 대입하는 것(자동)
		double d = 100.5; //8byte
		int n = 200; //4byte         --> double > int
		d = n; //d에 n을 대입
		System.out.println(d);
		
		char c = 'A'; //2byte
		int n1 = 100; //4byte        --> int > char
		n1 = c; //정수형 int에 문자형인 char을 대입한다면, 문자를 숫자로 변환시켜 저장(아스키코드)
		System.out.println(n1);
		
		
		 
	}//main

}
