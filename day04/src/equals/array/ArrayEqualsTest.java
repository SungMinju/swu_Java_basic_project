package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray1= {1,2,3,4,5};
		System.out.println("배열1의 주소:"+intArray1);
		//배열도 참조형 변수이므로, 주소가 아닌 실제 자료를 조회하려면
		//Arrays.toString(배열자료) 형식으로 호출해야 합니다.
		System.out.println(Arrays.toString(intArray1));
		System.out.println("---------------");
		//새로 생성하지 않고, intArray1을 대입받는 intArray2
		//힙에 저장된 자료를 새로 똑같이 할당하는 복사를 깊은 복사라 합니다.
		//변수 뒤에 .clone()을 써서 수행합니다.
		
	int [] intArray2 = intArray1.clone();
	System.out.println("배열1, 2간의 동등성 비교:"+(intArray1==intArray2));	
	intArray1[0] =100;
	System.out.println(Arrays.toString(intArray1));
	System.out.println(Arrays.toString(intArray2));
	System.out.println("배열 2의 주소:"+intArray2);
	}

}
