package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		//비교연산자
		//값을 비교해서 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1<n2; //-->true
		System.out.println("n1<n2 :" +res);
		
		res = n1>= n2;
		System.out.println("n1 >= n2 :"+res); //n1이 n2보다 크거나 같아?
		
		res = n1==n2; // 대입이 아닌 n1과 n2가 같은지
		System.out.println("n1 ==n2 :" +res);
		
		res = n1!= n2; //프로그램어에서 !는 부정의 의미 (not)
		System.out.println("n1 != n2 :"+res );
		
		// < : 작다 lt
		// > : 크다 gt
		
		//논리 연산자
        //비교연산자를 통한 연산이 두 개 이상 필요할 때 사용
		int age = 30;
		int limit = 35;
		res = (limit - age) >= 5 && age >30;
		//&& : and 연산자 : 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다
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
		//앞의 연산이 참이기 때문에 뒤의 연산을 수행. age = age + 2 : 32
		
		res = (limit - age) <= 2 && (age += 2)>=30;
		System.out.println("&& :" +res);
		System.out.println(age);
		//앞의 연산이 거짓이기 때문에 뒤의 연산을 수행하지 않음 age는 그대로 32
		
		int i1 = 10;
		int i2 = 20;
		//or(||)연산자 : 앞의 연산이 참이면 뒤의 연산을 수행하지 않는다
		//t || f = t
		//t || t = t
		//f || t = t
		//f || f = f
		res = (i1+=10) >20 || i2-10 == 11;
		System.out.println("||연산 :" +res);
		
	    //not 연산자 : 참을 거짓으로 거짓을 참으로 바꿔주는 연산자
		System.out.println(res); //False
		System.out.println("!연산자 :" + !res); //True
		System.out.println(res ); //not 연산자 !는 영구적이지 않다
		
	}//main

}
