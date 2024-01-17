package struct;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타 클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있습니다.
		
				// new 키워드는 힙에 자료를 저장합니다.
				// 자료형 변수 = new 자료형();
				// 위 명령어로 구조체의 인스턴스를 생성할 수 있습니다.
				// new 키워드의 리턴자료는 해당 힙의 주소
				
				// 사람 1 생성
				Human h1 = new Human();
				h1.name = "채종훈";
				h1.age = 20;
				h1.height = 175;
				
				getHumanInfo(h1); //35번줄로 호출->실행->20번줄 복귀
				System.out.println("사람 1의 주소 : " + h1); 
				
				// 사람 2 생성
				Human h2 = new Human();
				h2.name = "개발왕";
				h2.age = 10;
				h2.height = 180;
				
				getHumanInfo(h2); //35번줄 호출->실행->29번 복귀
				System.out.println("사람 2의 주소 : " + h2);

	}
	
	//Human 구조체를 받아서, 해당 구조체의 전체 필드 정보를 큰솔에 찍습니다.
	public static void getHumanInfo(Human h) {
		System.out.println("사람의 이름:"+h.name);
		System.out.println("사람의 나이:"+h.age);
		System.out.println("사람의 키:"+h.height);
	} // getHumanInfo는 HumanMain class에서 정의됨->스택에서 실행
	

}
