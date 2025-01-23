package school.lesson5;

class TransferFruits<T extends Fruit> {
    public void transferFruitsTo(Box<T> sourceBox, Box<T> destinationBox) {
        destinationBox.getFruits().addAll(sourceBox.getFruits());
        sourceBox.getFruits().clear();
    }
}