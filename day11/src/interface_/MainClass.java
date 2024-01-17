package interface_;

public class MainClass {

	public static void main(String[] args) {
		// 인터페이스 역시 구현체를 다형성 형식으로 받을 수 있습니다.
		RemoteController rc = new TVRemoteController(50);
		RemoteController rr = new RobotCleanerRemoteController("imou", "280,000");
		
		rc.turnOn();
		rc.showStatus();
		rc.turnOff();

	}

}