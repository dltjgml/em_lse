package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if - else ��
		//if( ���ǽ� ){
		//  ���ǽ��� ���� �� ����Ǵ� ����
		//}else{ else������ �Ұ�ȣ ���xxx
		//  ���ǽ��� ������ �� ����Ǵ� ����
		//}
		//if-else�� : �ַ� 2���������� �� ���
		
		int n = 49;
		String str = "";
		
		if (n++ >= 50) {
			str = "n�� 50 �̻��� ��"; //flase. n++ -> ����� ����
		}else {
			str = "n�� 50 �̸��� ��";
		}
		
		System.out.println(str);
		System.out.println("------------------------------");
		
		char ch = '��';
		
		if( ch == '��' ) {
			str = "����� �����Դϴ�";
		}else {
			str = "����� �����Դϴ�";
		}
		
		System.out.println(str);
		
		//�ٷ� ���� �ڵ带 ���׿����ڷ� �����Ͻÿ�
		
		String str2 = ch == '��' ? "����� �����Դϴ�" : "����� �����Դϴ�";
		System.out.println(str2);
		
		//���ǽ� ? ������ : ���� ����
        //��� if-else���� ���׿����ڷ� ������ �� �ִ�
		
	}//main

}
