package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2. Demotion
		// -���� �ڷ����� ū �ڷ����� ���ԵǴ� ��(�ڵ�x)
	    char c = 'C'; //2byte
	    int n = c+1; //4byte  -> �ڵ����� promotion casting ���� n=68 
	    //c = n; (error) char < int �� ����
	    c = (char)n; //demotion �� ���� (char) character �� ��ȯ�ϰڴٴ� ������ ����
	    System.out.println(c); //68=D
	    
	    float ff = 5.5f; //4.xx byte
	    n = 0; //4byte
	    n = (int)ff; //�Ҽ��� ���¸� �ǵ������� ���������� �ٲپ� �Ҽ��� ���ڸ��� ���ư�(�����ͻ�ǵǴ� ��� ���� �� ��)
		
	}//main

}
