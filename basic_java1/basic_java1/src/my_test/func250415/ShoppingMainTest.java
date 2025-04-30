package my_test.func250415;

public class ShoppingMainTest {

    public static void main(String[] args) {

        Shop shop1 = new Shop("Amazon");
        Shop shop2 = new Shop("Coupang");

        Customer c1 = new Customer("David", 100_000);
        Customer c2 = new Customer("Chris", 300_000);

        c1.purchase(shop1);
        c2.purchase(shop2);
        c1.showInfo();
        c2.showInfo();
        shop1.showInfo();
        shop2.showInfo();





    }
}
