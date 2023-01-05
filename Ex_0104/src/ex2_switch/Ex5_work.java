package ex2_switch;

public class Ex5_work {
	public static void main(String[] args) {
		
		//10 + 15 = 25
		
		int su1 =14600;  //비교값으로는 적합하지 않음
		int su2 = 60;
		char op = '/'; //+,-,*,%,/
		
		switch (op) {
		case '+':
			System.out.println(su1 +"+"+ su2 + "="+(su1+su2) );
			break;
		
		case '-':
			System.out.println(su1 +"-"+ su2 + "="+(su1-su2) );
			break;
			
		case '*':
			System.out.println(su1 +"*"+ su2 + "="+(su1*su2) );
			break;
			
		case '/':
			System.out.println(su1 +"/"+ su2 + "="+(su1/su2) );
			break;
			
		case '%':
			System.out.println(su1 +"%"+ su2 + "="+(su1%su2) );
			break;
			

		default: 
			System.out.println("♡엣쿵!! 오타난듯! 다시 보고 신중히! 입력해주쎼용♥");
			break;
		}
				
		
	}//main

}
