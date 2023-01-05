package ex5_printf;

public class Ex1_formater {
	public static void main(String[] args) {
		
		//������ : ����� �������� ����� ���ϴ� ������ ��� �����ϰ� ���ִ� ����
		
		//������ 23�� 01�� 05�� �Դϴ�.
		
		int year = 23;
		int month = 1;
		int day = 5;
		
		System.out.println("������ " + year +"�� " + month + "�� " + day + "�� �Դϴ�." );
		System.out.printf("������ %d�� %02d�� %02d�� �Դϴ�.\n", year, month, day); //�պ��� ���������� �ڸ� ä����
		//%d ���̿� 02 -> ���ڸ� 2�ڸ��� �������(01, 02, 03 .. 15)
		//        03 -> ���ڸ� 3�ڸ��� ������� (001, 002, 003... 123)
		
		//������ ������ 13.5���Դϴ�
		
		System.out.printf("������ ������ %.1f�� �Դϴ�.\n", 13.5f);//%f ���̿� .1 -> �Ҽ��� ���ڸ����� ǥ���ҷ���
		
		//���� A���Դϴ�.
		char bt = 'A';
		System.out.printf("���� %c�� �Դϴ�.\n", bt);
		
		//�� �̸��� ȫ�浿�Դϴ�.
		System.out.printf("�� �̸��� %s�Դϴ�\n", "ȫ�浿");
		
		//������ 100% ���� �߽��ϴ�.
		System.out.printf("������ %d%% ���� �߽��ϴ�.\n", 100);
		
		//1) %d : ����(int, long, byte)
		//2) %f : �Ǽ�(float, double)
		//3) %c : ����(char)
		//4) %s : ���ڿ�(string)
		//5) %% : %��ȣ�� ����Ϸ��� ����
		
		
		
		
		
		
		
		
		
		
	}//main

}
