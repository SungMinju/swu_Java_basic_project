package static_;

public class Asean {
	//
	public String name;
	private int attendanceScore;
	private int finalTermScore;
	
	public static int presentationScore; 
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore =attendanceScore;
		this.finalTermScore = finalTermScore;
		
		//public static int presentationScore; 
		//private static int presentationScore;..? 영상다시 참고
	}
	
	//스태틱 블록 내부 코드는 프로그램 시작시 즉시 자동으로 한 번 호출됨
	static {
		presentationScore = 29;
	}
	//스태틱 메서드도 객체 없이 바로 호출 가능함
	public static void showPresentationScore() {
		System.out.println(presentationScore);
	}
	
	public void showStudentScore() {
		System.out.println("학생명:"+this.name);
		System.out.println("학생명:"+this.attendanceScore);
		System.out.println("학생명:"+presentationScore);
		System.out.println("학생명:"+this.finalTermScore);
		System.out.println("최종성적:"+this.attendanceScore+presentationScore+finalTermScore);
		System.out.println("=========================");
	}

}
