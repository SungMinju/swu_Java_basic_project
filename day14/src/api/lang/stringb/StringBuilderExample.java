package api.lang.stringb;

public class StringBuilderExample {

	public static void main(String[] args) {
		//이 코드에서 StringBuilder는 전부 StringBuffer로 대체해도 잘 동작합니다.
		//둘의 차이는 쓰레드 안전이 보장되는지 아닌지 여부뿐입니다.
		//따라서 쓰레드 안전을 보장받고 싶다면 StringBuffer만 사용하시면 됩니다.
		StringBuilder sb=new StringBuilder("JAVA");
		//StringBuffer sb = new StringBuffer("JAVA");
		
		//문자열 끝에 추가하는 메서드 append()
		sb.append(" Program Study"); //sb += "Program Study"와 동일
		System.out.println(sb);
		
		//문자열을 특정 인덱스 위치에 삽입하는 메서드 insert()
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//특정 인덱스 범위 문자열을 교체하는 메서드 replace()
		sb.replace(5, 16, "book"); //5~15번 인덱스 11글자를 "book" 4글자로 치환
		System.out.println(sb);
		
		//문자열을 삭제하는 메서드 delete(begin, end)
		sb.delete(4, 9);
		System.out.println(sb);
		
		System.out.println(sb.length());

	}

}
