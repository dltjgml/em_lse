package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		//�񱳿�����
		//���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1<n2; //-->true
		System.out.println("n1<n2 :" +res);
		
		res = n1>= n2;
		System.out.println("n1 >= n2 :"+res); //n1�� n2���� ũ�ų� ����?
		
		res = n1==n2; // ������ �ƴ� n1�� n2�� ������
		System.out.println("n1 ==n2 :" +res);
		
		res = n1!= n2; //���α׷���� !�� ������ �ǹ� (not)
		System.out.println("n1 != n2 :"+res );
		
		// < : �۴� lt
		// > : ũ�� gt
		
		//�� ������
        //�񱳿����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ���
		int age = 30;
		int limit = 35;
		res = (limit - age) >= 5 && age >30;
		//&& : and ������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�
		//t && t = t
		//t && f = f
		//f && t = f
		//f && f = f
		System.out.println("&& :" +res); //->False
		
		res = (limit - age) >= 5 && age >=30;
		System.out.println("&& :" +res); // -> True
		
		res = (limit - age) >= 5 && (age += 2)>=30;
		System.out.println("&& :" +res);
		System.out.println(age);
		//���� ������ ���̱� ������ ���� ������ ����. age = age + 2 : 32
		
		res = (limit - age) <= 2 && (age += 2)>=30;
		System.out.println("&& :" +res);
		System.out.println(age);
		//���� ������ �����̱� ������ ���� ������ �������� ���� age�� �״�� 32
		
		int i1 = 10;
		int i2 = 20;
		//or(||)������ : ���� ������ ���̸� ���� ������ �������� �ʴ´�
		//t || f = t
		//t || t = t
		//f || t = t
		//f || f = f
		res = (i1+=10) >20 || i2-10 == 11;
		System.out.println("||���� :" +res);
		
	    //not ������ : ���� �������� ������ ������ �ٲ��ִ� ������
		System.out.println(res); //False
		System.out.println("!������ :" + !res); //True
		System.out.println(res ); //not ������ !�� ���������� �ʴ�
		
	}//main

}
