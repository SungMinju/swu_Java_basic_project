package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {

	public static void main(String[] args) {
		int a =100;
		double b =2.41;
		char c ='H';
		boolean d=false;
		
		//Wrapping : 기본형 타입을 참조형 타입으로 만들기
		//원래 new Integer(15); 와 같은 형식으로 사용해야 했으나
		//버전이 올라오면서 그냥 맞는 자료를 대입해주는 것만으로도 객체가 힙에 할당됨.
		
		Integer val1 = a; //new Integer(a);
		Double val2 = b; //new Double(b);
		Character val3 =c;
		Boolean val4 =d;
		Byte val5 =(byte)75;
		
		Object[] arr= {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
		
		//Unwrapping : 래퍼 클래스를 다시 기본형자료로 돌려놓기
		// .자료형 value() 메서드를 사용
		
		int i=val1.intValue();
		double j=val2.doubleValue();
		char k=val3.charValue();
		boolean x=val4.booleanValue();
		byte y =val5.byteValue();

	}

}
