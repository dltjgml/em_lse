package ex1_operator;

public class Ex6_exercise {
	public static void main(String[] args) {
		
		//casting : ���� �ٸ� �ڷ��� ���� ���� �ְ�ޱ� ���� (����ȯ)
		//1) promotion : �� ū �ڷ����� ���� �ڷ����� ���� ���� (�ڵ���ȯ)
		//2) demotion : �� ���� �ڷ����� ū �ڷ����� ���� ���� (������ȯ)
		
		//ex)promotion
		double d = 27.2;
		int i = 239;
		d = i;
		System.out.println(d);
		
		int i2 = 382;
		float f2 = 951.82f;
		f2 = i2;
		System.out.println(f2);
		System.out.println(i2);
		
		//ex)demotion
		double d3 = 3.3;
		int i3 = 780;
		i3 = (int)d3;
		System.out.println(i3);
		//���� �ڷ����� ���� = (��ȯ�ϰ����ϴ��ڷ���)ū�ڷ����� ����
		
		char c4 = 'D';
		int i4 = 120;
		c4 = (char) i4;
		System.out.println(c4);
		
		
		
		
		
		
		
		
		
		
	}
	
}
