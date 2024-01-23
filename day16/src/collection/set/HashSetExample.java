package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// 제네릭으로 내부자료형을 결정합니다.
		Set<String> set = new HashSet<>();
		
		//add():set에 객체를 추가
		set.add("닭강정");
		set.add("초밥");
		set.add("빠에야");
		set.add("우육명");
		set.add("닭강정");
		
		//size() : set에 저장된 객체의 수를 알아보는 메서드
		System.out.println("set에 저장된 객체의 수:"+set.size()); //4개
		System.out.println(set);
		
		//Set의 객체데이터를 사용하려면 반복자(Iterator)를 통해
		//모든 객체를 대상으로 한 번씩 반복해서 꺼내야 합니다.
		Iterator<String> iter = set.iterator(); //set을 반복할 수 있도록 처리
		
		//반복자 객체자 next()를 통해 set내부의 데이터를 반복해서 소진할 때
		//더 이상 조회할 데이터가 없다면 예외를 발생시키므로
		//hasNext()를 이용해 더 이상 소모할 데이터가 있는지 여부를 확인합니다.
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("단무지1")) {
				System.out.println(s);
			break;
			}
		}
		
		//remove(), clear() : set내부의 데이터 삭제 가능
		set.remove("빠에야");
		System.out.println(set);
		
		//set.clear();//집합 내부 비움
		
		if(set.isEmpty()) {
			System.out.println("Set이 비어있음");
		}
		else {
			System.out.println("Set이 비어있지 않음");
		}

	}

}
