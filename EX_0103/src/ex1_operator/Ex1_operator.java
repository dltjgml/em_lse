package ex1_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		/*
		 * ������
		 * 1. �ְ����� : , . ()
		 * 2. ���������� : ++ , --
		 * 3. ��������� : + , - , * , / , %
		 * 4. ����Ʈ������ : >> , <<
		 * 5. �񱳿����� : >,<, >= , <=, == , !=
		 * 6. ��Ʈ������ : & , | , ^
		 * 7. �������� :&&, | , !
		 * 8. ����(����)������ : ? , :
		 * 9. ���Կ����� := , *= , /+ , %= , +=, -+
		 */
		
		//���������
		//4Ģ����� ������ �����ڸ� �����ִ�.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1*n2;
		System.out.println("n3 :" + n3);
		
		n3 = n1/n2; //��
		System.out.println("/ :" +n3);
				
		n3 = n1%n2; // ��������
		System.out.println("% :" +n3);
		
		System.out.println("---------------------");
		
		//���Կ�����
		//Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
		int i1 = 10;
		int i2 = 3;
		i1 += i2; //i1 = i1+i2 -> i1�� 13���� ���ϴ� ��
		System.out.println("+= : " +i1);
		
		i1 -= 1; //i1 = i1-1 -> 13-1
		System.out.println("-= : " +i1);
		
		i1 %= 5; // i1 = i1%5
		System.out.println("%= :" +i1);
		
		i1 *= 6; // i1 = i1*6
		System.out.println("*= :"+i1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
