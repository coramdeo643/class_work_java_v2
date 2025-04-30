package com.composition;

public class Order {

    private String storeName;
    Food[] foods;

    public Order(String storeName) {
        this.storeName = storeName;
        this.foods = new Food[5];
        foods[0] = new Food("Big Mac");
        foods[1] = new Food("Fries");
        foods[2] = new Food("McFlurry");
        foods[3] = new Food("Coke");
    }

    void showOrders(int num) {
        System.out.println("-------------------------");
        System.out.println(storeName + " #" + num + " Order list : ");
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                foods[i].foodName();
            }

        }
    }

    public static void main(String[] args) {
        Order order1 = new Order("그린점");
        Order order2 = new Order("그린점");
        order1.showOrders(1);
        order2.showOrders(2);

    }

}
