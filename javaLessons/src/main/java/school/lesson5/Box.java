package school.lesson5;
import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public ArrayList<T> getFruits() {
        return fruits;
    }
}