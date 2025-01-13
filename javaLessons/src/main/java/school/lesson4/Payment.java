package school.lesson4;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void showItems() {
        for(Item item : items) {
            System.out.println(item.name + " : " + item.price);
        }
    }

    public class Item {
        String name;
        double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Milk", 1.5);
        payment.addItem("Bread", 1.0);
        payment.showItems();
    }
}
