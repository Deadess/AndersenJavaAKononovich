package school.lesson5;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        AddFruit<Apple> addApple = new AddFruit<>();
        AddFruit<Orange> addOrange = new AddFruit<>();

        addApple.addFruit(appleBox, new Apple());
        addApple.addFruit(appleBox, new Apple());
        addOrange.addFruit(orangeBox, new Orange());

        GetWeight<Apple> getAppleBoxWeight = new GetWeight<>();
        GetWeight<Orange> getOrangeBoxWeight = new GetWeight<>();

        System.out.println("Apple box weight is: " + getAppleBoxWeight.getWeight(appleBox));
        System.out.println("Orange box weight is: " + getOrangeBoxWeight.getWeight(orangeBox));

        CompareBoxes compareBoxes = new CompareBoxes();
        System.out.println("Weight of boxes is equal : " + compareBoxes.compare(appleBox, orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();
        TransferFruits<Apple> transferFruits = new TransferFruits<>();
        transferFruits.transferFruitsTo(appleBox, anotherAppleBox);

        System.out.println("Weight of the 1st apple box after transfering: " + getAppleBoxWeight.getWeight(appleBox));
        System.out.println("Weight of the 2nd apple box after transfering: " + getAppleBoxWeight.getWeight(anotherAppleBox));
    }
}