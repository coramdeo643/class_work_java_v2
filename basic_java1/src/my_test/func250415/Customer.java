package my_test.func250415;

public class Customer {

    String name;
    int budget;

    public Customer(String n, int b) {
        name = n;
        budget = b;
    }

    public void showInfo() {
        System.out.println(" = = = CUSTOMER STATUS = = = ");
        System.out.print("name = " + name);
        System.out.println(" / budget = $ " + budget);
    }

    public void purchase(Shop shop) {
        shop.purchase(5_000);
        budget -= 5_000;
    }


}
