package inheri;

public class MainClass1 {

	public static void main(String[] args) {
		//전사 생성
		Warrior w1 = new Warrior("Tom");
		
		w1.showStatus();
		
		Rabbit r1 = new Rabbit();
		Rat rat1 = new Rat();
		Boledog dog1 = new Boledog();
		
		w1.hunt(r1);
		w1.hunt(r1);
		
		w1.hunt(rat1);
		w1.hunt(rat1);
		w1.hunt(rat1);
		
		w1.showStatus();
		
		w1.hunt(dog1);
		w1.hunt(dog1);
		w1.hunt(dog1);
		
		
		w1.showStatus();

	}

}
