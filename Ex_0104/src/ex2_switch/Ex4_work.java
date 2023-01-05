package ex2_switch;

public class Ex4_work {
	public static void main(String[] args) {
		
		//8월은 31일까지 있습니다.
		//4월은 30일까지 있습니다.
		//13월은 없습니다.		
		int month = 1;
		
		switch (month) {
		case 1:
			for(month=1; month<=7; month++) {
				if(month%2==1) {
					System.out.println(month+"월은 31일까지 있습니다.");
				}//if
			}//for
			break;
		case 8:
			for(month=8; month<=12; month++) {
				if(month%2==0) {
					System.out.println(month+"월은 31일까지 있습니다.");
				}//if
			}//for
			break;
		case 2:
			System.out.println("2월은 28일까지 있습니다.");
			break;
		case 4:
			for(month=4; month<=6; month++) {
				if(month%2==0) {
					System.out.println(month+"월은 30일까지 있습니다.");
				}//if
			}//for
			break;
		case 9:
			for(month=9; month<=11; month++) {
				if(month%2==1) {
					System.out.println(month+"월은 30일까지 있습니다.");
				}//if
			}//for
			break;

		default:
			System.out.println(month+"월은 없습니다.");
			break;
		}//switch
		
		
	}//main

}
