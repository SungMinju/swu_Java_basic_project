package casting;

public class MainClass1 {

	public static void main(String[] args) {
		// Promotion이 적용되면 자식클래스에만 정의된 요소 조회 불가능
		Parent p = new child();
		p.method1(); //Parent에만 정의된 메서드
		p.method2(); //오버라이딩된 메서드는 타입상관없이 인스턴스 내 자식쪽 호출
		//p.method3(); //p타입 변수로는 자식쪽에만 정의된 요소는 호출 불가능
		System.out.println("---------------");
		
		child c =(child)p; //부모타입 변수를 자식타입으로 강제형변환(cast)
		c.method2(); //위와 동일하게 자식 method2 호출
		c.method3(); //형 변환 후에는 자식쪽에만 있는 요소도 호출가능
		
		child cc = new child(); //애초에 자식타입으로 인스턴스 대입시에도
		cc.method3(); //자식쪽에만 있는 요소 호출 가능
		
	}

}
