package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		
		//8���� 31�ϱ��� �ֽ��ϴ�.
		//4���� 30�ϱ��� �ֽ��ϴ�.
		//13���� �����ϴ�.		
		int month = 1;
		
		switch (month) {
		case 1:
			for(month=1; month<=7; month++) {
				if(month%2==1) {
					System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
				}//if
			}//for
			break;
		case 8:
			for(month=8; month<=12; month++) {
				if(month%2==0) {
					System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
				}//if
			}//for
			break;
		case 2:
			System.out.println("2���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
			for(month=4; month<=6; month++) {
				if(month%2==0) {
					System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�.");
				}//if
			}//for
			break;
		case 9:
			for(month=9; month<=11; month++) {
				if(month%2==1) {
					System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�.");
				}//if
			}//for
			break;

		default:
			System.out.println(month+"���� �����ϴ�.");
			break;
		}//switch
		
		
	}//main

}
