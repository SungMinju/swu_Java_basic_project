package example.thread3;

public class HighChef implements Runnable {
	
	@Override
	public void run() {
		System.out.println("오장이 후임들에게 일하라고 시킵니다.");
		try {
			Thread.sleep(1000);
			주찬만들기();
		}
		catch(Exception e) {}
	}
	public void 주찬만들기() {
		System.out.println("오장이 주찬을 만들기 시작합니다.");
		try {
			Thread.sleep(10000);
			System.out.println("주찬을 다 만들었습니다.");
		}
		catch(Exception e) {}
	}

}
