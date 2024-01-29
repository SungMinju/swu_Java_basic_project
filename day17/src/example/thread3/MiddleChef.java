package example.thread3;

public class MiddleChef implements Runnable{
	
	@Override
	public void run() {
		부찬만들기();
		국끓이기();
	}
	
	public void 부찬만들기() {
		System.out.println("센터가 국을 끓이기 시작합니다.");
		try {
			Thread.sleep(5000);
			System.out.println("센터가 국을 다 끓였습니다.");
		}
		catch(Exception e) {}
	}
	
	public void 국끓이기() {
		System.out.println("센터가 부찬을 만들기 시작합니다.");
		try {
			Thread.sleep(6000);
			System.out.println("센터가 부찬을 다 만들었습니다.");
		}
		catch(Exception e) {}
	}

}
