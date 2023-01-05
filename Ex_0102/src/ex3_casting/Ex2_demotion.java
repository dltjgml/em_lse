package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2. Demotion
		// -작은 자료형이 큰 자료형이 대입되는 것(자동x)
	    char c = 'C'; //2byte
	    int n = c+1; //4byte  -> 자동으로 promotion casting 실행 n=68 
	    //c = n; (error) char < int 기 때문
	    c = (char)n; //demotion 할 때는 (char) character 로 변환하겠다는 뜻으로 삽입
	    System.out.println(c); //68=D
	    
	    float ff = 5.5f; //4.xx byte
	    n = 0; //4byte
	    n = (int)ff; //소수의 형태를 의도적으로 정수형으로 바꾸어 소수점 뒷자리는 날아감(데이터상실되는 경우 생길 수 ㅇ)
		
	}//main

}
