package ex1_operator;

public class Ex3_operation {
	public static void main(String[] args) {
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� Ȯ���� ��������!
		int a = 10;
		System.out.println("a :" + ++a); //�������� --> ���� ���� ����
		System.out.println("a :" + --a); //���న��

		int b = 10; 
		System.out.println("b :" + b++); //�������� --> ���� �ʰ� ���� ���⼭�� b�� ���� 10 , �������ʹ� 11
		System.out.println("b :" + b--); //���న�� 
		
		b++;
		--b;
		--b;
		++b;
		b--;
		b--;
		b++;
		++b;
		System.out.println(b--);
		
		//���������ڴ� �ѹ��� 1���� ��� �����ϹǷ�
		//2 �̻��� ������ �Ϸ��� ���Կ����ڸ� ����ϴ� ���� ����
		b += 2;
		System.out.println(b);
		
		//����(����) ������
		//������ �ΰ�, �� ���ǿ� ���� ����� ���� ���� ������ ���� ����
		//�ٸ� ����� �����ִ� ������
		int aa = 10;
		int bb = 15;
		boolean res = ++aa >= b ? true : false; //�񱳿���, ? , : �� ��Ʈ
		System.out.println(res);
		
		char res2 = ++aa < bb ? 'y' : 'n'; //���� �� �ڰ� ����
		System.out.println(res2);
		
		
	}//main

}//class end
