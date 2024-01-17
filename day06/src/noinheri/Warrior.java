package noinheri;

public class Warrior {
	//정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	//생성자를 만들어주세요. id만 입력받고
	//나머지 필드 -체력은 20, 공격력3, 방어력 1, 경험치 0으로 초기화
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	//캐릭터 상태가 조회 가능한 showStatus()를 만들어 보겠습니다.
	// 이 메서드는 멤버변수 정보를 콘솔에 찍어줍니다.
	public void showStatus() {
		System.out.println("아이디:"+this.id);
		System.out.println("체력:"+this.hp);
		System.out.println("공격력:"+this.atk);
		System.out.println("방어력:"+this.def);
		System.out.println("획득경험치:"+this.exp);
		System.out.println("--------------------");
	}
	
	//단독 사냥을 하도록 메서드를 만듭니다.
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽은 토끼입니다.");
			return; //죽은 토끼에 대해서는 추가 로직이 필요없음
		}
		//1. 내가 공격한 토끼의 체역을 3 깎습니다.
		rabbit.setHp(rabbit.getHp() - this.atk);
		//2. 방금 공격으로 죽였다면 경험치 5 증가
		if(rabbit.getHp()<=0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
			}
		else {
			System.out.println("토끼를 공격했습니다");
		}
		
	}
	public void huntRat(Rat rat) {
		if(rat.getHp() <= 0) {
			System.out.println("이미 죽은 쥐입니다.");
			return;
		}
		rat.setHp(rat.getHp()- this.atk);
		if(rat.getHp() > 0) {
			System.out.println("쥐를 공격했습니다.");
			System.out.println("쥐를 반격했습니다.");
			this.hp = this.hp - rat.getAtk();
		}
		else if(rat.getHp()<= 0){
			System.out.println("쥐를 죽였습니다.");
			this.exp += 80;
		}
	}

}
