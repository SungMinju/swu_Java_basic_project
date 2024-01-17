package abstract_.abs;

public class ConvenientStore extends PopupStore{

	@Override
	public void orderApple() {
		System.out.println("가당 사과주스를 4,000원에 팝니다.");
		
	}

	@Override
	public void orderOrange() {
		System.out.println("가당 오렌지과주스를 3,500원에 팝니다.");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("가당 포도주스를 4,500원에 팝니다.");
		
	}

}
