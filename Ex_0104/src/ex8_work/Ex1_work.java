package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		//2��for���� ����Ͽ� �Ʒ��� ����� ����Ͻÿ�
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		
		System.out.println("---------------------");
		
		
		//2�� for�� ���
		//        *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		
		
		for(int i =0; i<5; i++) {
			for(int q =0; q<4-i; q++) {
				System.out.print("  ");
			}
			for(int j =0; j<(i+1)*2-1; j++) {
			
				System.out.print(" *");
			}//inner
			
			
			System.out.println();
		}//outer
		
		
		
		
		
		
		
	}//main

}
