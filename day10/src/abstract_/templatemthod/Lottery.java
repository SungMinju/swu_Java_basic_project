package abstract_.templatemthod;

public abstract class Lottery {
	// 템플릿 메서드 패턴은, 큰 틀에서 호출구문은 구현메서드(실행문이 있는 메서드)
	// 로 정의해놓고, 구현메서드가 호출하는 추상메서드들은 
	// 상속 후에 특징을 정하도록 만들어서
	// 호출 순서는 그대로 가져갈 수 있도록 하되, 사용자가 특징만 정의하도록 하는 
	// 디자인 패턴입니다.
	
	//구현메서드에는 큰 틀은 같지만 세부사항이 달라질 수 있는 내용을 먼저 작성합니다.
	public final void lotteryCycle() {
		//1. 복권을 삼
		buyLottery();
		//2. 당첨 여부를 확인
		checkWinLottery();
		//3.당첨시 수령하러 간다
		getLotteryMoney();
		
	}
	
	//세부사항은 상속받은 주체가 무엇인지에 따라 다르게 정의 할 수 있도록
	//추상메서드만 정의해놓고, 추가적인 작업은 하지 않습니다.
	public abstract void buyLottery();
	public abstract void checkWinLottery();
	public abstract void getLotteryMoney();
		
	

}
