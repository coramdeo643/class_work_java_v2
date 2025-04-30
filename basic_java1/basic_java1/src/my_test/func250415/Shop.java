package my_test.func250415;

public class Shop {

    String brand;
    int count;
    int money;

    public Shop(String br) {
        brand = br;
    }

    public void purchase(int pay) {
        money += pay;
        count++;
    }

    public void showInfo() {
        System.out.println("= = = SHOP STATUS = = =");
        System.out.print("brand = " + brand);
        System.out.print(" / count = " + count);
        System.out.println(" / money = $ " + money);
    }


} // end of class
