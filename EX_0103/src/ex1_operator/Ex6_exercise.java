package ex1_operator;

public class Ex6_exercise {
	public static void main(String[] args) {
		
		//casting : 서로 다른 자료형 간에 값을 주고받기 위함 (형변환)
		//1) promotion : 더 큰 자료형에 작은 자료형의 값을 대입 (자동변환)
		//2) demotion : 더 작은 자료형에 큰 자료형의 값을 대입 (수동변환)
		
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
		//작은 자료형의 변수 = (변환하고자하는자료형)큰자료형의 변수
		
		char c4 = 'D';
		int i4 = 120;
		c4 = (char) i4;
		System.out.println(c4);
		
		
		
		
		
		
		
		
		
		
	}
	
}
