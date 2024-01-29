package example.thread2;

public class LowChef {
	
	public void 밑반찬만들기() {
		System.out.println("막내가 밑반찬을 만들기 시작합니다.");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
	}
	
	public void 밥짓기() {
		System.out.println("막내가 밥을 짓기 시작합니다.");
		try {
			Thread.sleep(10000);
		}
		catch(Exception e){}
	}
	
	public void 재료손질() {
		System.out.println("막내가 재료를 손질하기 시작합니다.");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
	}

}
