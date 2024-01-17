package exception.trycatch;
import java.util.Scanner;

public class TryCatchExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
            try {
                System.out.println("성함을 적어주세요 :");
                String name = scanner.nextLine();
                if (name.matches("[가-힣]+")) {
                    System.out.println("성함: " + name);
                    break; // 입력이 유효하면 루프를 빠져나갑니다.
                } else {
                    throw new Exception(); // 입력이 유효하지 않으면 예외를 발생시킵니다.
                }
            } 
            catch (Exception e) {
                System.out.println("잘 못 기입하셨습니다. 다시 기입해 주세요");
            }
        }

        System.out.println("환영합니다.");
        System.out.println("종료");
		

	}

}
