package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		//switch - case�� : �񱳰��� ���ǰ��� ���� ����� ó���ϴ� ���
		//switch( �񱳰� ){
		//  case ���ǰ�:
		//    �񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		//  break;
		//}
		
		int n = 5;
		switch( n ) {//�񱳰�
		case 1: //���ǰ��� Ÿ���� �񱳰��� �ݵ�� ��ġ�ؾ� �Ѵ� ex) int��� ������ ����Ұ�, �ƽ�Ű�ڵ庯ȯ�����Ѱ��� ��밡��
			System.out.println("1.���ӽ���");
			break;//switch���� ������ ���������� Ű����
			
		case 2: //���� case�� ����ߴ� ���ǰ� ��� ����
			System.out.println("2.���ӼҰ�");
			break;
			
		case 3:
			System.out.println("3.�ɼ�");
			break;
			
		default:
			//�񱳰��� ���ǰ��� ��� ��ġ���� �������
			//�ݵ�� ����Ǵ� ����
			System.out.println("1, 2, 3 �߿����� �Է����ּ���");
			break;
		}//switch
		//�������� �������� �������鼭 �����Ͽ� �� ������ �Ǵ��ϴ� ���� �ƴϰ� �񱳰��� �´� ���ǰ��� �ٷ� ã�� ������
		//if-else������ ó���ӵ��� ����. �׷��� if-else�� �޸� ���� ���� �Ұ�
        
	}//main

}
