package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
		/*
		 * ���)
		 * �Ϸ� ���귮 : 17��
		 * �ð��� ��� : 17���� 24�ð��� ���ļ� ����Ǵ� ��. 1�ð��� ���? 0.xxxx��
		 * 
		 * �������� �ִ�.
		 * ��, ���, �������� Ű��� �ִµ�, �Ϸ� ���귮�� ���� 
		 * 5,  7,  5���̴�.
		 * 
		 * 1) ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���
		 * 2) �ѽð��� ��� ������ ����Ǵ��� ���
		 * 
		 * ##��, ������ ������ �Ϸ���귮�� ������ ������ intŸ������,
		 * �ð��� ������� ����� ������ float Ÿ������ ���� ��.
		 * 
		 * ##���� ����� ������ �ڵ�����, �ּ� �� ���� �̻��� ����� ����� �� ��.
		 * */
		
		//���1
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int total = pear + apple + orange;
		System.out.println(total);
		System.out.println(5+7+5);
		//total = 5+7+5 = 17
		
		float avg = total / 24f;
		System.out.println(avg);
		
		System.out.println((float) total / 24f);
		//���� avg�� ������� �ʰ� int total�� float���� ��ȯ�� �� ����.(demotionȰ��, �ڵ���ȯx ������ȯ)
		
		
		//���� �ڵ��
		//ª�� ������ �ڵ�, ���������� ������ ��
		
		
	}//main

}
