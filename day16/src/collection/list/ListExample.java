package collection.list;
 
//임포트해야 쓸수 있음.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// ArrayList와 LinkedList는 사용양식은 전부 List인터페이스를 따릅니다.
		// 따라서 교환이 가능합니다. 인터페이스가 같은 구현체들은 사용법이 모두 같습니다.
		//제네릭 : 타입 안정화를 위해 객체 내부에 저장되는 타입을 일치시키는 방법
		//String만 저장할 수 있는 컬렉션
		
		//다형성이 적용되는 특정 인터페이스 타입에 구현체를 선택적으로 대입하는 패턴을 전략패턴이라고 합니다.
		//List<String> list = new ArrayList<>(); //1.8버전부터는 생성자에 제네릭 표시X
		List<String> list = new LinkedList<>();
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		System.out.println(list);  //컬렉션들은 toString()이 자동으로 오버라이딩 되어 
		                           //주소값이 아닌 내부 저장 요소가 바로 콘솔에 찍힘
		
		//list에 객체를 저장하는 메서드 add() : 데이터를 마지막 지점에 추가
		list.add(str1);
		list.add(str2);
		list.add("infra");
		list.add("docker");
		list.add("linux");
		list.add("linux"); //중복 저장 허용
		System.out.println(list);
		
		//list에 저장된 총 객체 수 얻기 .size()
		int size = list.size();
		System.out.println("list에 저장된 총 갹체의 수 : "+size);
		
		//list에 객체 삽입 add(index, 객체) : 데이터를 해당 인덱스 번호 넣고
		//해당 인덱스 이후 자료는 전부 한칸씩 뒤로 밀어내기
		list.add(2, "Network");
		System.out.println(list);
		
		//list 데이터 수정 set(index, 객채)
		//list[3] = "ubuntu"; //일반 인덱싱으로 수정하기 사용 불가
		list.set(5,"ubuntu");
		System.out.println(list);
		
		//list 내부객체 가져오기 get(index)
		String s =list.get(2);
		System.out.println(s);
		
		//list 내부에 저장된 객체의 번호가 몇번인지 확인하기
		int idx = list.indexOf("docker"); //없는 자료 조회시 -1
		System.out.println(idx);
		
		//list에서 객체데이터 삭제 remove(index) , remove(객체)
		list.remove(5);
		System.out.println(list);
		list.remove(str1);
		
		//list 내부에 저장된 객체의 유무확인 contains() -> 있으면 true, 없으면 false
		System.out.println(list.contains(str1));
		
		//list의 반복문 처리
		//인덱스 조회
		for(int i =0; i<list.size(); i++) {
			System.out.println("내부요소 : "+list.get(i));
		}

		System.out.println("------------");
		//향상된 for문도 사용가능(List<String>으로 서언했으므로 String으로 받기
		for(String str : list) {
			System.out.println("내부요소 : "+str);
		}
		
		
		//list 내부의 전체 자료 삭제 clear()
		list.clear();
		System.out.println(list); //list변수의 빈 리스트는 남아있음.
		
		//list 내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty()
		System.out.println(list.isEmpty());
	}

}
