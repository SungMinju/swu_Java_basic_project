public class Product {
    private String productName;
    private int price;
    private int stock;

    public void set(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public boolean sellProduct(int num) {
        if (num > stock) {
            return false;
        } else {
            stock -= num;
            return true;
        }
    }
    public void showInfo() {
        System.out.println("제품명: " + productName);
        System.out.println("가격: " + price);
        System.out.println("재고: " + stock);
    }
    public void addStock(int quantity) {
        stock += quantity;
    }

    public String getName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

