package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		
		//��� : ���α׷��� �帧�� �����ϴ� ����
		// - �б⹮ : if, switch
		// - �ݺ��� : for, while
		
		//if( ���ǽ� ){
		//  ���ǽ��� ���� �� ����Ǵ� ����
		//}
		
		int n = 50;
		//String�� ""�ȿ� ��������(���ڿ�)�� ���� ������ �ڷ���
		String str = "";
		
		if( n == 50 ) {
			//���ǽ��� ���� �� ����Ǵ� ����
			str = "n=50"; //��
		}
		
		if( n != 50 ) {
			str = "n�� 50�� �ƴϴ�";
		}
		
		//�̷��� Hello��� ����� ���� ������ ���� ��. 
		//String ���� ������ �� ���� ""�ȿ� ���𰡸� �ۼ����� x
		System.out.println(str);
		
		
		
		
		
	}//main

}
