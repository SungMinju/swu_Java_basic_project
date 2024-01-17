package encapsulation.bad;

public class MainClass {

	public static void main(String[] args) {
		// 같은 패키지 내부 클래스파일을 가져다 쓸 때는 import 구문이 필요없음
		MyBirthaday b = new MyBirthaday();
		
		b.year = 2024;
		b.month =13;
		b.day = 32;
		
		b.showDateInfo();
	}

}
