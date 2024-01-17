package exception.runtime;

public class ArrayIndexExample {

	public static void main (String[] args) {
		int [] arr = {3 , 6, 9};
		
		//있지도 않은 인덱스번호 조회하기, 그러나 문법상 오류는 없음
		System.out.println(arr[30]);
	}
}
