package class_;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 고양이 2마리 생성
		Cat c1=new Cat();
		c1.name="어완자";
		c1.age=5;
		c1.kind="엑조틱숏헤어";
		c1.color="치즈";
		
		
		Cat c2=new Cat();
		c2.name="룰루";
		c2.age=5;
		c2.kind="스코티시폴드";
		c2.color="쿠앤크";
		
		c1.showCatInfo();
		c2.showCatInfo();

	}

}
