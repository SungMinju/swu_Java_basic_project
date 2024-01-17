package class_;

public class BasketballPlayer {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	
	//생서자는 리턴타입이 없고, 클래스명과 동일한 이름으로 메서드를 정의하면 됩니다.
	public BasketballPlayer(String n, int h, int a, int t) {
		name=n; //생성자를 생성하면서 전달받은 n으로 필드 name을 초기화
		height = h;
		age=a;
		salary=t;
	}
	
	
	
	//showInfo(BasketballPlayer소속이므로 굳이 해당 단어를 적지 않아도 구분 가능)
	
	public void showInfo() {
		System.out.println("농구선수의 이름:"+name);
		System.out.println("농구선수의 키:"+height);
		System.out.println("농구선수의 나이:"+age);
		System.out.println("농구선수의 연봉:"+salary);
	}
	
	public void dunkShoot() {// 덩크슛하기 기능
		if(height>190) {
			System.out.println("덩크슛 성공!");
		}
		else {
			System.out.println("골대에 닿지 않음.");
		}
	}

}
