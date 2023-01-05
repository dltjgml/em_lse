package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		//2중 for문을 사용하여 아래의 결과를 도출해내세요
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//..........
		//10 1 2 3 4 5 6 7 8 9
		
		
		int n = 10;
		int i = 0;
		int j = 0;
		
		
		
		for(i = 0; i<n; i++) {
			
			for( j=0; j<n-i; j++) {
				
				System.out.print( i+j+1 + " ");
				
		    }//inner
			
			for(int k=0; k<i; k++) {
				System.out.print(k+1 + " ");
			}
			
			System.out.println();
			
		}//outer
		
		
		
		
		
		
		
		
		
		
	}//main

}
