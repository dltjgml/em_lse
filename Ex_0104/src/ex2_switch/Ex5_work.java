package ex2_switch;

public class Ex5_work {
	public static void main(String[] args) {
		
		//10 + 15 = 25
		
		int su1 =14600;  //�񱳰����δ� �������� ����
		int su2 = 60;
		char op = '/'; //+,-,*,%,/
		
		switch (op) {
		case '+':
			System.out.println(su1 +"+"+ su2 + "="+(su1+su2) );
			break;
		
		case '-':
			System.out.println(su1 +"-"+ su2 + "="+(su1-su2) );
			break;
			
		case '*':
			System.out.println(su1 +"*"+ su2 + "="+(su1*su2) );
			break;
			
		case '/':
			System.out.println(su1 +"/"+ su2 + "="+(su1/su2) );
			break;
			
		case '%':
			System.out.println(su1 +"%"+ su2 + "="+(su1%su2) );
			break;
			

		default: 
			System.out.println("������!! ��Ÿ����! �ٽ� ���� ������! �Է����֛�뢾");
			break;
		}
				
		
	}//main

}
