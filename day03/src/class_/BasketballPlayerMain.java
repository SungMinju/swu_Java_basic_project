package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BasketballPlayer h1 = new BasketballPlayer("최성우", 186,26,300); //(생성자들)
		 //h1.name ="최성우";
		 //h1.height=186;
		// h1.age=26;
		// h1.salary=300;
		 
		 BasketballPlayer h2= new BasketballPlayer("박상철", 195,35,400);
		 //h2.name="박상철";
		 //h2.height =195;
		 //h2.age=30;
		 //h2.salary=350;
		 
		 h1.showInfo();
		 h1.dunkShoot();
		 h2.showInfo();
		 h2.dunkShoot();
		 
		 
		 

	}

}
