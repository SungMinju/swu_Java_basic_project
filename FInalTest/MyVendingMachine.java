import java.util.Scanner;
import java.util.ArrayList;

class MyVendingMachine implements VendingMachineInterface {
    private int profit;
    private int totalSales;
    public ArrayList<Product> productList = new ArrayList<Product>(3);
    public Admin manager;

    public MyVendingMachine() {
        profit = 0;
        totalSales = 0; // 초기 매출액을 0으로 설정
        manager = new Admin();
        manager.setAdmin();
    }

    public void setProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 제품을 입력하시겠습니까? :");
        int numberOfProducts = checkInputValue();
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("***** " + (i + 1) + "번째 제품 *****");
            System.out.print("제품 이름: ");
            String name = scanner.nextLine();
            System.out.print("제품 가격: ");
            int price = checkInputValue();
            System.out.print("제품 수량: ");
            int quantity = checkInputValue();
            scanner.nextLine();

            Product product = new Product();
            product.set(name, price, quantity);
            productList.add(product);
        }
    }

    public int menuPrint() {
        System.out.println("구매할 제품의 번호를 입력하세요");
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getStock() > 0) {
                System.out.println((i + 1) + ". " + product.getName() + " - " + product.getPrice() + "원 - 수량: " + product.getStock() + "개");
            }
        }       
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> ");
        int selectedProduct = scanner.nextInt();
        scanner.nextLine();
        return selectedProduct;
    }

    public int calSum(int selNo, int num) {
        int selectedProductIndex = selNo - 1;
        Product product = productList.get(selectedProductIndex);
        int price = product.getPrice();

        if (num > product.getStock()) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("재고가 부족합니다.");
            System.out.println("1. 제품 구매");
            System.out.println("2. 관리자");
            System.out.println("3. 종료");
            System.out.print("--> ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    int newSelNo = menuPrint();
                    System.out.print("수량을 입력하세요: ");
                    int newNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(productList.get(newSelNo - 1).getName() + "을/를 " + newNum + "개 선택하였습니다.");
                    return calSum(newSelNo, newNum);
                case 2:
                    System.out.println("관리자 권한이 있어야 하는 메뉴입니다.");
                    if (manager.checkAdmin()) {
                        adminMenu();
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("유효하지 않은 옵션입니다.");
                    break;
            }
        } else {
            int total = price * num;
            product.sellProduct(num);
            totalSales += total;

            if (product.getStock() == 0) {
                productList.remove(selectedProductIndex);
            }

            return total;
        }

        return 0;
    }


    public void adminMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 제품 등록");
            System.out.println("2. 매출 확인");
            System.out.println("3. 전체 제품 확인");
            System.out.println("4. 재고 확인");
            System.out.println("5. 재고 추가");
            System.out.println("6. 이전 메뉴");
            System.out.print("--> ");

            String input = scanner.nextLine();

            try {
                int option = Integer.parseInt(input);

                switch (option) {
                    case 1:
                        setProduct();
                        break;
                    case 2:
                        System.out.println("현재 총 매출액: " + totalSales + "원");
                        break;
                    case 3:
                        System.out.println("#####################");
                        if (productList.isEmpty()) {
                            System.out.println("총 0개의 제품이 있습니다.");
                        } else {
                            for (Product product : productList) {
                                System.out.println("제품 이름: " + product.getName());
                                System.out.println("가격: " + product.getPrice() + "원");
                                System.out.println("수량: " + product.getStock() + "개");
                            }
                            System.out.println("총 " + productList.size() + "개의 제품이 있습니다."); // 등록된 제품 개수 출력
                        }
                        System.out.println("######################");
                        break;
                    case 4:
                        System.out.println("어떤 상품의 재고를 확인할까요?");
                        String productName = scanner.nextLine();
                        checkStock(productName);
                        break;
                    case 5:
                        System.out.println("어떤 상품의 재고를 추가할까요?");
                        productName = scanner.nextLine();
                        System.out.println("몇 개 추가할까요?:");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        addStock(productName, quantity);
                        break;
                    case 6:
                    	System.out.println("이전 메뉴로 돌아갑니다.");
                        return; 
                    default:
                        System.out.println("유효하지 않은 옵션입니다.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("문자를 입력하셨습니다.");
            }
        }
    }

    public void checkStock(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product.getName() + " 재고: " + product.getStock() + "개");
                return;
            }
        }
        System.out.println("없는 상품입니다.");
    }

    public void addStock(String name, int theNbOfPrct) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.addStock(theNbOfPrct);
                System.out.println(product.getName() + " 상품 총 재고: " + product.getStock() + "개");
                return;
            }
        }
        System.out.println("없는 상품입니다.");
    }

    public int checkInputValue() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("문자를 입력하셨습니다. 숫자를 입력하세요");
            }
        }
    }
}
