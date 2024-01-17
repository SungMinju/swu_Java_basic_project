package exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) {
		String str =null;
		str = "HELLO";
		
		//.toLowercase() 는 모든 문자를 소문자로 만들어줍니다.
		System.out.println(str.toLowerCase());

	}

}
