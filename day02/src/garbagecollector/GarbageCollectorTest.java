package garbagecollector;

public class GarbageCollectorTest {
	public int objectNum; //객체번호
	
	//생성자(객체가 힙에서 생성될 떄 호출되는 메서드)
	public GarbageCollectorTest(int number) {
		objectNum =number;
		System.out.println(objectNum + "번 객체 생성");
	}
	 //소멸자(자바에서는 일반 사용하지 않음, 객체가 힙에서 삭제되기 직전 실행)	
	@Override
	protected void finalize()throws Throwable{
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	}

}
