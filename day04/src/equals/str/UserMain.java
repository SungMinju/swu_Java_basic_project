package equals.str;

public class UserMain {

	public static void main(String[] args) {
		// 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		//String 객체를 생서할 시 같은 주소값을 공유하게 됩니다.
		
		String s1="룰루";
		String s2="룰루";
		System.out.println(s1==s2); //힙에서 같은 주소를 스택에서 공유하고 있음.
		String s3= new String("룰루"); //new는 무조건 heap에 새롭게 할당
		//s1, s2, s3 모두가 "룰루"라는 문자열을 가지고 있음
		System.out.println(s1+s2+s3);
		System.out.println(s1==s3);
		
		//문자열도 참조형 변수이므로 단순 비교는 주소값 비교만 합니다.
		//따라서 주소가 아닌 자료의 동등성을 따질 때는 .equals()를 씁니다.
		System.out.println(s1.equals(s3)); //주소값 비교X 해당 문자열 동등성을 비교

	}

}
