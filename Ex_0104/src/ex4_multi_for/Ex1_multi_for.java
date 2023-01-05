package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		
		//다중 for문 : for문 안에 for문이 추가되어있는 경우
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int i = 1; i<=3; i++) { //행(y)
			
			for(int j = 1; j<=5; j++ ) { //안쪽 for문이 돌고 바깥쪽 for문은 횟수를 의미  / 열(x)
 				
				System.out.print(j + " "); //ln의 의미는 enter 없애면 옆으로 한칸 , 무조건 i, j사용x 바깥 변수 활용할수도
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("------------------------------------");
		
		//1 2 3
		//4 5 6
		//7 8 9
		
		int c = 1;
		
		for(int a = 1; a<=3; a++) {
			
			for(int b = 1; b<=3; b++) {
				
				System.out.print(c++ +" ");

				
			}//inner
			
			System.out.println();
			
		}//outer
		
		/*
		 * int num = 0;
		 * for(int i = 1; i<=3; i++){
		 *     
		 *    for(int j=1; j<=3; j++){
		 *        
		 *     System.out.print(num + " "); 
		 * }//inner
		 *     System.out.println();
		 * 
		 * }//outer
		 * 
		 */
		
		System.out.println("---------------------------------------");
		
		//A B C
		//D E F
		//G H I
		
		char ch = 'A'; //A=65 char ch = 65;로 해도 가능
		
		for(int i =1; i<=3; i++) {
			
			for(int j =1; j<=3; j++) {
				
				System.out.print(ch++ + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
		
		

	}//main
}
