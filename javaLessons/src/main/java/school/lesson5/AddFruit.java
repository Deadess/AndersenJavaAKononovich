package school.lesson5;

class AddFruit<T extends Fruit> {
    public void addFruit(Box<T> box, T fruit) {
        box.getFruits().add(fruit);
    }
}