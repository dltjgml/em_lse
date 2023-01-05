package ex1_if;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if
		//if(조건식1){
		//  조건식 1이 참일 때 실행되는 영역
		//}else if(조건식2){
		//  조건식 2가 참일 떄 실행되는 영역
		//}else if(조건식3)......
		
		int num = 1;
		String str ="";
		
		if(num>=90) {
			str = "A";
			
		}else if(num >= 80) {
			str = "B";
			
		}else if(num >= 70) {
			str = "C";
			 
		}else if(num >= 60 ) {
			str = "D";
		}//else if(num < 60) {
			//str = "F" -> 이렇게 한다면 조건의 통일성이 떨어지기 때문에 else문 사용
		else {
			str = "F"; //위의 조건을 제외한 모든 조건을 F로 하려한다면 else-if가 아닌 else문 사용
		}
		
		System.out.println(str);
		//else-if문은 위에서부터 참 거짓을 판단하면서 내려오다가 중간에 참인 조건을 만나면 아래의 조건은 무시하고 값이 출력된다.
		//절대평가 성적 산출에 용이
		
	}//main

}
