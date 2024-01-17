package exception.runtime;

public class NumberFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="35";
		String b ="21";
		System.out.println(a+b);
		
		//str -> int 변환
		int i = Integer.parseInt(a); //문자 삼오(35)를 숫자 35(삼십오)로 변환
		int j = Integer.parseInt(b); 
		System.out.println(i+j);
		
		//parseInt는 문자열 내부에 순수한 정수가 들어있어야
		//변환을 실행하며 정수값이 아니라면 NumberFormatExeption이 발생합니다.
		String str = "Hello";
		System.out.println(Integer.parseInt(str));

	}

}
