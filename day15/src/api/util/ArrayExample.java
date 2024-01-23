package api.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int[] scores = {75,47,23,56,89};
		                 //깊은 복사를 수행하는 명령어.
		int[] scores2 =Arrays.copyOf(scores,scores.length);
		int[] scores3 =Arrays.copyOf(scores, 3); //적힌 길이만큼만 복제
		
		//Arrays.sort(): 배열의 데이터를 오름차순으로 정렬하는 메서드
		Arrays.sort(scores2);
		System.out.println("scores: "+Arrays.toString(scores));
		System.out.println("scores2: "+Arrays.toString(scores2));
		System.out.println("scores2: "+Arrays.toString(scores3));
		
		//Arrays.binarySearch(): 배열의 내부 인덱스번호를 탐색하는 메서드
		int index =Arrays.binarySearch(scores, 75);
		System.out.println("75가 저장된 인덱스 번호: "+index);
		
		//Arrays.equals(배열1, 배열2) : 주소갑싱 아닌 배열 내부 요소 비교
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {1,3,5,7,9};
		         //삼항연산자, arr1과 arr2의 주소는 달라도 내부 자료만 같으면 true
		String result = Arrays.equals(arr1, arr2) ? "항목일치" : "항목불일치" ;
		System.out.println(arr1.toString()+ arr2.toString());
		System.out.println(arr1 == arr2); //주소값 비교는 false
		System.out.println(result);
	}

}
