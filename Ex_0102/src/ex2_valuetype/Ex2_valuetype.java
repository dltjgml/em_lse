package ex2_valuetype;

public class Ex2_valuetype {

	public static void main(String[] args) {
	
		//기본자료형(valueType) //는 한줄 주석 /*/는 다중주석
	    /*
	          논리형 : boolean - 1bit true or false
	          문자형 : char - 2byte ''안에 한글자
	          정수형 : byte - 1byte .......-128 ~ 127      무언가를 저장하는데 사용하지 않음
	           short - 2byte ......-32768 ~ 32767   사이즈가 애매해서 사용하지않음 (이전 자료와의 호환성을 위해 남겨져있는것)
	           int - 4byte ........-21억 ~ 21억 일반적으로 가장 많이 사용
	           long - 8byte .......-900경 ~ 900경 일반 개발보다는 증권사 등 방대한 자료를 요구하는 곳 위주
	          실수형 : float - 4.xx byte
	           double - 8.xx byte
	    */
	       
	       //변수 : 특정 값을 저장하기 위한 공간
	       //ㄴ그릇(자료형)을 구별하는 식별자
	       
	       //변수 선언 규칙
	       //1) 자료형 변수명; (선언) 각각 다른 이름을 붙혀줌
	       //2) 변수명 = 값; (대입) 변수명에 값을 집어넣는 것
	       //3) 자료형 변수명 = 값; (초기화) 선언 + 대입
	       
	       //변수 선언시 주의사항
	       //1) 같은 영역에서 변수 이름을 중복되지 않도록 한다
	       //2) _를 제외하고는 특수문자를 포함할 수 없다
	       //3) 변수명은 반드시 소문자로 시작
	       //4) 변수명은 숫자로 시작할 수 없으며, 반드시 영문으로 작성할 것 (영어에 대소문자가 있기 때문)
	       
	       
	       //1)논리형
	       //참과 거짓. 즉, true와 flase값만을 저장하는 자료형 타입
	       boolean b;
	       b = true;
	       b = false;
	       
	       //boolean b2 =1; 불가능 
	       // true or false 이외 다른 값 넣기 불가능
	       System.out.println(b);
	       
	       b = true;
	       System.out.println(b);
	       
	       //문자형
	       //''안에 딱 한글자만 저장 가능한 자료형
	       char c = 'A';
	       System.out.println("c:"+c);
	       
	       char c2 = 65 + 1; //아스키코드
	         //char c2 = 'B' + 1; -> 이렇게 하면 c 출력
	       System.out.println("c2: "+c2);
	       
	       //정수형
	       //byte by = 128; -> 오류. 잘못된 범위
	       int n1 = 2100000000; //보통 정수형 자료형에서 int가 default
	       //long n2 = 2200000000; 
	       //오류. 22억은 int에 못들어가는데? 자료형 확인 안하고 지멋대로 판단 
	       long n2 = 2200000000L; 
	       //int의 범위를 벗어나는 값을 long타입에 저장하려면 반드시 L키워드 추가
	       System.out.println("long값 : "+n2);
	       System.out.println("int 값 : "+n1);
	       
	       //실수형
	       //소수점을 가진 값들을 저장하기 위한 자료형
	       //double이 기본 자료형을 지정되어있지만 용량이 크기 때문에 float을 주로 씀
	       float f1 = 3.14F; //float타입에 저장하려면 뒤에 F or f 추가
	       //float f1 = 3.14; -> error
	       double f2 = 3.14; //보통 실수형에서 double이 default (기본 자료형으로 지정)
	       System.out.println(f1);
	       System.out.println(f2);
	       
	       f1=100;
	       f2=100;
	       System.out.println(f1);
	       System.out.println(f2);
	       //실수형에서는 그릇에 정수를 넣어도 실행 가능 (단 정수에 .0이 붙어 소수의 형태로 저장됨)
	       
	       
		
		
	}
}
