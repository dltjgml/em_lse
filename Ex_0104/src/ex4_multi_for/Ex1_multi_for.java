package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		
		//���� for�� : for�� �ȿ� for���� �߰��Ǿ��ִ� ���
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int i = 1; i<=3; i++) { //��(y)
			
			for(int j = 1; j<=5; j++ ) { //���� for���� ���� �ٱ��� for���� Ƚ���� �ǹ�  / ��(x)
 				
				System.out.print(j + " "); //ln�� �ǹ̴� enter ���ָ� ������ ��ĭ , ������ i, j���x �ٱ� ���� Ȱ���Ҽ���
				
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
		
		char ch = 'A'; //A=65 char ch = 65;�� �ص� ����
		
		for(int i =1; i<=3; i++) {
			
			for(int j =1; j<=3; j++) {
				
				System.out.print(ch++ + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		
		
		

	}//main
}
