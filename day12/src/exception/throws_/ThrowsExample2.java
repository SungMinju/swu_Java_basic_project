package exception.throws_;

public class ThrowsExample2 {
	
	public void aaa(int n) throws Exception{ 
//여기서 이런 종류의 예외가 발생할건데 직접 처리하기 싫으니 호출한 곳에서 처리해라
		System.out.println("aaa호출");
		int i =10 / n;
		System.out.println("계산 결과:"+i);
		System.out.println("aaa실행 중");
	}
	
	public void bbb() throws Exception{
		System.out.println("bbb호출");
		aaa(0);
		System.out.println("bbb실행 중");
	}
	
	public void ccc()throws Exception{
		System.out.println("ccc호출");
		bbb();
		System.out.println("ccc실행 중");
	}
	
	public ThrowsExample2() throws Exception{
		System.out.println("생성자 호출");
		ccc();
		System.out.println("생성자 실행 종료");
	}

	
	public static void main(String[] args) {
		try {
			ThrowsExample2 te = new ThrowsExample2();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("진짜 코드 호출 끝");
	}

}
