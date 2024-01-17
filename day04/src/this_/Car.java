package this_;

public class Car {
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model; // this. 이 붙는다면 멤버변수.
		this.speed=0;// 굳이 this를 안 붙여도 되지만 가독성을 위해 붙임.
	}
	
	public void accel() {
		if(this.speed + 10>=150) {
			this.speed=150;
		}else {
			this.speed+=10;
		}
	}
	
	public void showStatus() {
		System.out.println("모델명:"+model);
		System.out.println("현재속도:"+speed);
	}

}
