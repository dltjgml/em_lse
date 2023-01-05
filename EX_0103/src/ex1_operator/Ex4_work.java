package ex1_operator;

public class Ex4_work {
	public static void main(String[] args) {
		
		
		//실행전에 답을 먼저 고민해보고 실행 뒤 출력값이랑 답 비교하기
		int a = 10;
		int b = 12;
		
		int res = ++a >= b || 2 + 7 <= b  && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0;
		
		boolean res2 = ++a >= b || 2 + 7 <= b;
		System.out.println(res2);
		//11 >= 12 or 9 <= 12
		//   F     or   T     -> T
		boolean res3 = 2 + 7 <= b && 13 - b >= 0;
		System.out.println(res3);
		//T and 1>= 0
		//T and T     -> T
		boolean res4 = 13 - b >= 0 && (a += b) - ( a % b ) > 10;
		System.out.println(res4);
		// T and 23 - 11 > 10
		//앞의 괄호에서 바뀐 a값도 뒤에 적용
		// T and T   -> T
		//----------> 1
		
		System.out.println(res);
		
		
				
		
	}//main

}
