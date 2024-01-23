package api.lang.math;

public class MathExample {

	public static void main(String[] args) {
		// 수학 관련된 연산이나 혹은 상수를 저장해둔 Math 클래스는 정적 변수와 메서드를 가지므로
		// 굳이 Math 객체를 생성하지 않아도 활용할 수 있습니다.
		
		//절대값: 부호를 떼버림
		System.out.println(Math.abs(15.294));
		//올림: 소수점 아래자리가 존재하면 1 증가
		System.out.println(Math.ceil(10.0));
		System.out.println(Math.ceil(10.0000001));
		//내림: 소수점 아래자리를 없애버림
		System.out.println(Math.floor(10.0));
		System.out.println(Math.floor(10.999999));
		//max: 제시된 수 중 가장 큰 값 하나만 남김
		System.out.println(Math.max(99.9, 12.34 ));
		//min: 제시된 수 중 가장 작은 값 하나만 남김
		System.out.println(Math.min(0.00001, 0.00000001));
		//무작위 수: 하지만 컴퓨터 시스템은 완벽한 난수가 아닌 시드값에 따른 의사난수를 씁니다.
		System.out.println(Math.random());
		//rint
		System.out.println(Math.rint(12.5000000001));
		//반올림
		System.out.println(Math.round(12.34525));
		
		//혹은 Math클래스 내에 정적변수로 자주 사용하는 상수값(원주율, 자연상수 등)도 제공합니다.
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
