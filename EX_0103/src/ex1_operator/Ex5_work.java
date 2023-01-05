package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
		/*
		 * 결과)
		 * 하루 생산량 : 17개
		 * 시간당 평균 : 17개가 24시간에 걸쳐서 생산되는 것. 1시간에 몇개꼴? 0.xxxx개
		 * 
		 * 과수원이 있다.
		 * 배, 사과, 오렌지를 키우고 있는데, 하루 생산량은 각각 
		 * 5,  7,  5개이다.
		 * 
		 * 1) 과수원에서 하루에 생산되는 과일의 총 개수를 출력
		 * 2) 한시간에 몇개의 과일이 생산되는지 출력
		 * 
		 * ##단, 과일의 개수와 하루생산량을 저장할 변수는 int타입으로,
		 * 시간당 생산수를 출력할 변수는 float 타입으로 만들 것.
		 * 
		 * ##같은 결과가 나오는 코드지만, 최소 두 가지 이상의 방법을 사용해 볼 것.
		 * */
		
		//방법1
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
		//변수 avg를 사용하지 않고 int total을 float으로 변환할 수 있음.(demotion활용, 자동변환x 직접변환)
		
		
		//좋은 코드란
		//짧고 간결한 코드, 유지보수가 용이한 코
		
		
	}//main

}
