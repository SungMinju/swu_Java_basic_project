package this_;

public class HumanMain {
	public static void main(String[] args) {
		Human kim =new Human("김자바", 20);
		kim.showInfo();  //이름 김자바 나이는 20입니다.
		
	    Human park=new Human("박코딩");
	    park.showInfo(); // 이름 박코딩 나이는 0입니다.
	    
	    Human noname=new Human();
	    noname.showInfo();
	}

}
