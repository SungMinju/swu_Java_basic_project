package encapsulation.good;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBirthday b = new MyBirthday(2024, 12, 50);
		//b.day=50;  //private이므로 외부인 Main 직접 주입 불가능
		b.showDateInfo();
		//b.setDay(19);

	}

}
