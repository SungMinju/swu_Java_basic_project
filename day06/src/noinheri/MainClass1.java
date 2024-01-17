package noinheri;

public class MainClass1 {
	public static void main(String[] args) {
		//전사 하나 생성
		Warrior w1 = new Warrior("리눅스 개발");
		//생성 직후 정보 조회
		w1.showStatus();
		//토끼 생성
		Rabbit r1 = new Rabbit();
		//쥐 생성
		Rat rat1 = new Rat();
		//토끼와 교전
		w1.huntRabbit(r1);
		//죽은 토끼 한번 더 공격해보기
		w1.huntRabbit(r1);
		//사냥 후 정보 조회
		w1.showStatus();
		
		
	}

}
