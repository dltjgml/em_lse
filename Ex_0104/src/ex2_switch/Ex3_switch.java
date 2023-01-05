package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		
		//switch문은 비교값으로 딱 세가지 타입만 사용이 가능
		//정수(byte, int, short), 문자열(String), 문자(char)
		//boolean, float, double, long과 같은 것 사용 불가
		
		char ch ='이';
		
		switch(ch) {//비교값
		case '김':
			System.out.println("21%");
			break;
			
		case '이':
			System.out.println("14%");
			break;
			
		case '박':
			System.out.println("8%");
			break;
			
			//break에 걸리지 않으면 비교값이 조건값과 일치하지 않더라도 break를 만날 때까지 출력한다
			//의도적으로 break를 사용하지 않는 경우도 있다
			
		}//switch
		
	}//main

}
