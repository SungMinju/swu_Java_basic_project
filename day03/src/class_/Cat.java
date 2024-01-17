package class_;

public class Cat {
	//이름, 나이, 품종, 털색깔
	public String name;
	public int age;
	public String kind;
	public String color;
	
	// 클래스 정의용 클래스파일 내부 메서드는 static을 붙이지 않습니다.
	//이제 변수와 메서드가 같은 소속이므로, 레퍼런스 주소를 붙이지 않아도 됩니다.
	public void showCatInfo() {
		System.out.println("고양이의 이름:"+name);
		System.out.println("고양이의 나이:"+age);
		System.out.println("고양이의 품종:"+kind);
		System.out.println("고양이의 색상:"+color);
	} //cat class에서 정의 되었기 때문에 힙에서 실행됨

}
