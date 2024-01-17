package day02;

public class FloatExample {

	public static void main(String[] args) {
		//매직넘버 실수는 double이기 떄문에 float자료형에 저장할떄는
		//뒤에 f를 붙여서 float으로 바꿔야 합니다.
		// TODO Auto-generated method stub
		float f1 = 7.12345F;
		double d1=7.12345;
		System.out.println(f1);
		System.out.println(d1);
		System.out.println("--------");
		float f2=1.23456781234F;
		double d2=1.23456781234;
		System.out.println(f2);
		System.out.println(d2); //float자료형은 표현범위가 double보다 좁아 일부 누락
		
		System.out.println(0.12345e+7); //0.12345를 12자리 올리기
		System.out.println(100e-5); //100을 5자리 내리기
		
	}

}
