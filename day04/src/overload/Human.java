package overload;

public class Human {
	public String name;
	public int age;
	
	//생성자 오버로딩은, 생성자를 여러 유형으로 만드는 것
	//파라미터는 () -> void 파라미터
	//        (String, int)
	
	//1번째 호출 방법
	public Human() {// void파라미터, new Huma() 인 경우 호출
		name="이름을 입력하지 않았습니다.";
		age=19;
	}
	//2번째 호출 방법
	public Human(String n, int a) {//String, int 파라미터, new Human("문자",정수)
		name=n;
		age=a;
	}

}
