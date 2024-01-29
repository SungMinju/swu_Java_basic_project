package example.thread3;

public class LowChef implements Runnable {
	
	@Override
	public void run() {
		밑반찬만들기();
		밥짓기();
		재료손질();
	}
	
	public void 밑반찬만들기() {
		System.out.println("막내가 밑반찬을 만들기시작합니다.");
		try {
			Thread.sleep(5000);
			System.out.println("막내가 밑반찬을 다 만들었습니다");
		}
		catch(Exception e) {}
	}
	
	public void 밥짓기() {
		System.out.println("막내가 밥을 짓기 시작합니다");
		try {
			Thread.sleep(7000);
			System.out.println("막내가 밥을 다 지었습니다.");
		}
		catch(Exception e) {}
	}
	
	public void 재료손질() {
		System.out.println("막내가 재료를 손질하기시작합니다.");
		try {
			Thread.sleep(5000);
			System.out.println("막내가 재료를 다 손질했습니다.");
		}
		catch(Exception e) {}
	}

}
