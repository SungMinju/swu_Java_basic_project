package has_a;

public class MainClass {

	public static void main(String[] args) {
		// Gun을 new키워드로 생성해야 Police생성자에 전달 가능
		Gun gun = new Gun("M-16", "369486");
		
		//gun을 사전에 생성하지 않으면 넘길 방법이 없음
		Police police = new Police(gun, "경찰", 180);
		
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();

	}

}
