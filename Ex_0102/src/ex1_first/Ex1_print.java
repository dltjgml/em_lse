package ex1_first;

public class Ex1_print {
	
	public static void main(String[] args) {
		
		//java단위 3개
		//1)File - New - Other - java project - Next
		//2)Src - New - Package 무조건 하나는 있어야함 (폴더의 개념 - 데이터들을 종류별 역할별로 분류해서 사용)
		//3)New Class - Class의 첫글자는 반드시 대문자 (클래스 하나 당 화면 한페이지의 기능)
		//Class를 만들면 가장 먼저 Main의 영역이 필요 (복붙가능) -main+ctrl, Spacebar
		
		 //주석 : 컴파일시 JVM이 인지하지 못하는 메모 용도의 텍스트 영역
	     //main메서드 : 컴파일 시 가장먼저 호출되는 영역
	    System.out.println( 100 );//<-한 줄이 끝나면 반드시 ;로 마무리
	    System.out.println( 200 );
	   
	    //숫자형태가 아닌 데이터(문장 등)를 넣으려면 ""안에 넣어주어야함 (문장, 문자열이라 부름)
	    System.out.println("안녕하세요"); 
	    
	    //연산자의 경우 컴퓨터가 알아서 수행을 해줌
	    System.out.println(10 + 10);
	    System.out.println(10 * 10);
	    
	    System.out.println("10 * 10 = " + 100); //"" 뒤에 +가 들어갔을 때, 이어붙인다는 뜻을 가진다
	    System.out.println("10*10="+10*10); // 이렇게 계산도 가능
	    System.out.println("5+1="+5+1); //문장 뒤에 +는 연산을 못함. 즉 ""뒤에 모든 +는 이어붙인다는 뜻을 가진다 5+1=51이 출력 -도 불가
	    System.out.println("5-1="+ (5-1) ); //먼저 연산해야하는 부분을 괄호 안에 넣어주면 먼저 연산
	    System.out.println(1+1+"1+1="+1+1); //"" 앞의 +는 기본적으로 계산을 한다. ""바로앞의 +도 앞과 연결

		
	}

}
