package exception.multi;

public class MultiCatchExample {

	public static void main(String[] args) {
		String data1 = "30";
		String data2 = "11";
		//String data2 = "0";
		
		try {
			//NumberFormatException 발생 가능
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			//ArithmeticException 발생 가능
			int result = i/j;
			System.out.println("i/j ="+result);
			
			//NullPointerException 발생 가능
			String str = null;
			str.charAt(0); //0번째 문자 얻기 ...인데 null
		}
		catch(NumberFormatException | NullPointerException e) {
			System.err.println("데이터를 숫자만 넣어주세요");
			System.err.println("혹은 문자를 제대로 만들어주세요");
		}
		catch(ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e){//범용 에러 처리(대부분의 에러를 다 커버쳐줌)
			System.err.println("알 수 없는 에러가 발생했습니다.");
			System.err.println("복구 중입니다.");
		} // catch예외처리를 위에서 부터 해당하는지 비교하면서 내려옴
	}

}
