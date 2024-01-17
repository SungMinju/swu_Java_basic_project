package abstract_.templatemthod;

public class KoreanLotto extends Lottery {

	@Override
	public void buyLottery() {
		System.out.println("한 게임에 천원짜리 로또를 삽니다.");
		
	}

	@Override
	public void checkWinLottery() {
		System.out.println("45C6의 확률을 뚫고 1등에 당첨되었습니다.");
		
	}

	@Override
	public void getLotteryMoney() {
		System.out.println("1등 상금으로 대략 수십억을 받았습니다.");
		
	}

}
