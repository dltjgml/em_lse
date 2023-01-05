package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if - else 문
		//if( 조건식 ){
		//  조건식이 참일 때 실행되는 영역
		//}else{ else옆에는 소괄호 사용xxx
		//  조건식이 거짓일 때 실행되는 영역
		//}
		//if-else문 : 주로 2지선다형일 때 사용
		
		int n = 49;
		String str = "";
		
		if (n++ >= 50) {
			str = "n은 50 이상의 수"; //flase. n++ -> 담부터 증가
		}else {
			str = "n은 50 미만의 수";
		}
		
		System.out.println(str);
		System.out.println("------------------------------");
		
		char ch = '남';
		
		if( ch == '여' ) {
			str = "당신은 여자입니다";
		}else {
			str = "당신은 남자입니다";
		}
		
		System.out.println(str);
		
		//바로 위의 코드를 삼항연산자로 수정하시오
		
		String str2 = ch == '남' ? "당신은 남자입니다" : "당신은 여자입니다";
		System.out.println(str2);
		
		//조건식 ? 조건참 : 조건 거짓
        //모든 if-else문은 삼항연산자로 수정할 수 있다
		
	}//main

}
