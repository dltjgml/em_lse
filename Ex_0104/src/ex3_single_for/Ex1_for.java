package ex3_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
	    //반복문 : 특정 수행문을 여러번 반복할 수 있도록 해주는 제어문
		//for(초기식; 조건식; 증감식){
		//   조건식이 참인 경우 실행되는 영역
		//}
		
		for(int i = 0; i<3; i++) {
			System.out.println(i);
			//1. 초기식 수행 i=0 딱 한번
			//2. 조건식으로 넘어가 조건을 비교 i<3이기에 참.
			//3. 참일 경우만 실행.
			//4. 증감식으로 다시 올라가서 수행
            //5. 조건식이 거짓이 나올 때까지 조건-실행-증감 순으로 실행
			
		}//for
		
		//for문 안쪽의 지역변수 i는 for문의 소속이므로, for의 여역을 벗어나면 사용이 불가능
		
		int n = 0;
		for(n=1; n<=3; n++) {
			System.out.println(n);
		}
		System.out.println(n);
		
		
	//10에서 1까지 감소되는 값
		for(int n2=10; n2>=1; n2--) {
			System.out.println(n2);
		}//for
		
	//1~100까지 100회전을 하는 for문, 3의 배수만
		int a= 1;
		for(a=1; a<=100; a++) {
			if(a%3==0) {
				System.out.println(a);
			}//if
		}//for
		
		System.out.println("------------------------------------------------");
		
		for(int i = 3; i<=100; i+=3) {
			System.out.println(i);
		}
		//선행증감과 후행증감은 결과값이 같다
		//대입연산자도 쓸 수 있다. += -= *= %= 모두 사용 가능!
		
	}//main

}
