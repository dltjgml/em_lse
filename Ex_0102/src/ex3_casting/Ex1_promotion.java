package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//casting(����ȯ)
		//���� �ٸ� �ڷ��� ���� ���� �ְ�ޱ� ���� ����(����)
		
		//1.promotion 
		// - ū �ڷ����� ���� �ڷ����� �����ϴ� ��(�ڵ�)
		double d = 100.5; //8byte
		int n = 200; //4byte         --> double > int
		d = n; //d�� n�� ����
		System.out.println(d);
		
		char c = 'A'; //2byte
		int n1 = 100; //4byte        --> int > char
		n1 = c; //������ int�� �������� char�� �����Ѵٸ�, ���ڸ� ���ڷ� ��ȯ���� ����(�ƽ�Ű�ڵ�)
		System.out.println(n1);
		
		
		 
	}//main

}
