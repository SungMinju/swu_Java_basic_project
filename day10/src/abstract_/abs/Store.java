package abstract_.abs;

public class Store extends PopupStore {

	@Override
	public void orderApple() {
		System.out.println("착즙 사과주스를 20,000원에 팝니다.");
	}

	@Override
	public void orderOrange() {
		System.out.println("착즙 오렌지주스를 24,000원에 팝니다.");
	}

	@Override
	public void orderGrape() {
		System.out.println("착즙 포도주스를 18,000원에 팝니다.");
	}

}