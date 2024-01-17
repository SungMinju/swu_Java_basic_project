package casting;

public class MainClass2 {

	public static void main(String[] args) {
		// Parent 타입에는 child, Child2 모두 대입 가능
		Parent p1 =new Child2();
		p1.method2();
		//p1.method3();
		//Parent 타입으로는 
		//child1의 method2도, Child2의 method2도 호출 가능
		//method2는 Parent에도 정의되어있지만 child와 Child2에도 정의된
		//오버라이딩(재정의)된 메서드이기 떄문에 호출가능함.
		

	}

}
