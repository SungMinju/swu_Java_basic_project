import java.util.Scanner;

class Admin {
    private int id;
    private String pw;

    public void setAdmin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("관리자를 생성합니다.");
        System.out.print("새로운 id를 생성해주세요(숫자만 생성가능): ");
        while (true) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("아이디는 숫자입니다.");
                System.out.println("id:");
                scanner.nextLine();
                
            }
        }
        System.out.print("새로운 pw를 생성해주세요(숫자,영문_대소문자 생성가능): ");
        pw = scanner.nextLine();
        System.out.println("새로운 관리자 ID: " + id + "  PW: " + hidePassword(pw));
    }

    public boolean checkAdmin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("id: ");
        int inputId;
        while (true) {
            if (scanner.hasNextInt()) {
                inputId = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("아이디는 숫자입니다. 다시 입력해주세요.");
                scanner.nextLine();
            }
        }
        System.out.print("pw: ");
        String inputPw = scanner.nextLine();

        if (id==inputId && pw.equals(inputPw)) {
            return true;
        } 
        else {
            System.out.println("관리자 권한이 없습니다.");
            return false;
        }
    }
    private String hidePassword(String password) {
        StringBuilder hiddenPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            hiddenPassword.append("*");
        }
        return hiddenPassword.toString();
    }

    public boolean isAdmin() {
        return checkAdmin();
    }
}
