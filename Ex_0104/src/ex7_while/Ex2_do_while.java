package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		
		//do-while : �� ó��, �� ��
		//����� �� �����ϰ� ;�� ���ξ���Ѵ�
		//do{
		//   ���ǽ��� ���� �� ����Ǵ� ����
		//}while(���ǽ�);
		
		int i = 11;
		do {
			System.out.println(i);
			//i++;
		}while(i<=10);
		
		System.out.println("----------------------------");
		
		//���� java, jsp, android�� ��������
		//0~130 ������ ���� ��´�
		//do-while�� ���� �� ������ ������ ��� 0~100������ ����
		//while�� �������� �� ���� ���� ������ ���
		
		//���
		//�ڹ� : 00	
		//jsp : 00
		//�ȵ� : 00
		
		Random rnd = new Random();
		
		/*int java = rnd.nextInt(131) + 0;
		int jsp = rnd.nextInt(131) +0;
		int android = rnd.nextInt(131) +0;
		
		do {
			System.out.println(java);
		}while(java >100);
		
		do {
			System.out.println(jsp);
		}while(jsp >100);
		
		do {
			System.out.println(android);
		}while(android >100);
		
		
		System.out.println("java : "+java);
		System.out.println("jsp : "+jsp);
		System.out.println("android : " +android );
		*/
		
		int java = 0;
		int jsp = 0;
		int android = 0;
		
		
		do {
			
			java = rnd.nextInt(131);
			jsp = rnd.nextInt(131);
			android = rnd.nextInt(131); //do-while �ȿ� ������ ���������� ��
			
		}while(java>100 || jsp>100 || android>100 );
		
		System.out.println("java : "+java);
		System.out.println("jsp : "+jsp);
		System.out.println("android : " +android );
			
		
		
	}//main

}
