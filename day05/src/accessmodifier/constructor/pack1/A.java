package accessmodifier.constructor.pack1;

public class A {
	//멤버 변수 선언
	A a1= new A(true); //public 생성자 호출
	
	A a2 = new A(3); //default 생성자 호출
	
	A a3 = new A("hi"); //private 생성자 호출
	
	//생성자들 선언
	public A(boolean a) {}// public 생성자는 boolean 파마리터
	
	A(int i){} // default 생성자는 int 파라미터
	
	private A(String s) {} //private 생성자는 String 파라미터.
}
