package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		//switch - case문 : 비교값과 조건값을 통해 결과를 처리하는 제어문
		//switch( 비교값 ){
		//  case 조건값:
		//    비교값과 조건값이 일치하는 경우 실행되는 영역
		//  break;
		//}
		
		int n = 5;
		switch( n ) {//비교값
		case 1: //조건값의 타입은 비교값과 반드시 일치해야 한다 ex) int라면 정수만 사용할것, 아스키코드변환가능한것은 사용가능
			System.out.println("1.게임시작");
			break;//switch문을 완전히 빠져나가는 키워드
			
		case 2: //이전 case에 사용했던 조건값 사용 못함
			System.out.println("2.게임소개");
			break;
			
		case 3:
			System.out.println("3.옵션");
			break;
			
		default:
			//비교값과 조건값이 모두 일치하지 않을경우
			//반드시 실행되는 영역
			System.out.println("1, 2, 3 중에서만 입력해주세요");
			break;
		}//switch
		//위에부터 차근차근 내려오면서 대입하여 참 거짓을 판단하는 것이 아니고 비교값에 맞는 조건값을 바로 찾기 때문에
		//if-else문보다 처리속도가 빠름. 그러나 if-else와 달리 범위 지정 불가
        
	}//main

}
