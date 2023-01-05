package ex5_printf;

public class Ex2_work {
	public static void main(String[] args) {
		
		
		//5 * 1 = 5
		//.......
		
		//2 ~ 9 사이의 값만 입력해주세요 
		
		int dan = 11;
		int a = 1;
		
		
		
		if(dan >= 2 && dan <=9) {
			
			for (a = 1; a<=9; a++ ) {
				
				System.out.printf("%d * %d = %d \n",dan, a, a*dan);
				
			}//for
			
			
		}else {
			System.out.println("구구단은 2부터 9까지에여!★");
		}
		
		
		
	}//main

}
