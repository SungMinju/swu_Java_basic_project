import java.util.Scanner;
public class MainUI {
    public static void main(String[] args) {
        MyVendingMachine vendingMachine = new MyVendingMachine();
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;

        while (!exit) {
            System.out.println("1. 제품 구매");
            System.out.println("2. 관리자");
            System.out.println("3. 종료");
            System.out.print("--> ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                	if (vendingMachine.productList.isEmpty()) {
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                	
                    int selectedProduct = vendingMachine.menuPrint();
                    System.out.print("수량: ");
                    int quantity = vendingMachine.checkInputValue();
                    
                    if (quantity <= 0) {
                        System.out.println("유효한 수량을 입력해주세요.");
                        break;
                    }
                    Product product = vendingMachine.productList.get(selectedProduct - 1);
                    System.out.println(product.getName() + "을/를 " + quantity + "개 선택하였습니다.");
                    int total = vendingMachine.calSum(selectedProduct, quantity);
                    
                    System.out.println("총 금액: " + total + "원");
                    break;
                case 2:
                    System.out.println("관리자 권한이 있어야 하는 메뉴입니다.");
                    if (vendingMachine.manager.checkAdmin()) {
                        vendingMachine.adminMenu();
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("유효하지 않은 옵션입니다.");
                    break;
            }
        }
    }
}
