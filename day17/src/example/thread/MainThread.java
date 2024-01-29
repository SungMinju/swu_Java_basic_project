package example.thread;

public class MainThread {

	public static void main(String[] args) {
		// 보조쓰레드 실행을 위해서는 먼저 Thread 객체를 생성해야 합니다.
		
		//1. Runnable 구현체를 생성해주세요
		Runnable trd = new MultiThread();
		
		//2. Thread 클래스의 인스턴스를 생성해주세요
		//생성자 호출시 위의 Runnable 구현체를 파라미터로 넘깁니다.
		Thread sTrd = new Thread(trd);
		
		System.out.println("보조쓰레드 준비 완료");
		
		//3. 보조쓰레드는 .start()로 호출 할 수 있습니다.
		sTrd.start();
		System.out.println("먼저 끝나도 프로그램은 계속 돌아가는 메인메서드");

	}

}
