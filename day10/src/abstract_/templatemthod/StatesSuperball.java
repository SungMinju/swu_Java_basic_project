package abstract_.templatemthod;

public class StatesSuperball extends Lottery{

	@Override
	public void buyLottery() {
		System.out.println("미국가서 슈퍼볼 복권을 삽니다.");
		
	}

	@Override
	public void checkWinLottery() {
		System.out.println("69C5 * 26C1 분의 1의 확률로 당첨되었습니다.");
		
	}

	@Override
	public void getLotteryMoney() {
		System.out.println("당첨금액은 최소 수천억원입니다.");
		
	}

}
