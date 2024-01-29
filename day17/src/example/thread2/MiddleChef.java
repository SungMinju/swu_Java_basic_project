package example.thread2;

public class MiddleChef {
	
	public void 부메뉴만들기() {
		System.out.println("센터가 부메뉴를 만들기 시작합니다.");
		
		try {
			Thread.sleep(3500);
		}
		catch(Exception e) {}
	}
	
	public void 국끓이기() {
		System.out.println("센터가 국을 끓이기 시작합니다.");
		try {
			Thread.sleep(2500);
		}
		catch(Exception e) {}
	}

}
