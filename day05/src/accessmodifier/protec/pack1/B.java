package accessmodifier.protec.pack1;

public class B {
	
	public B() {
		A a = new A(); //같은 패키지 내에 있으므로 호출 가능
		a.s = "hi";
		a.method();
	}

}
