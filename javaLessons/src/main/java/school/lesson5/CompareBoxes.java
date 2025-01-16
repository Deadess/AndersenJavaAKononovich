package school.lesson5;

class CompareBoxes {
    public <T extends Fruit> boolean compare(Box<T> box1, Box<? extends Fruit> box2) {
        GetWeight<T> getWeight1 = new GetWeight<>();
        GetWeight<? extends Fruit> getWeight2 = new GetWeight<>();
        return getWeight1.getWeight(box1) == getWeight2.getWeight(box2);
    }
}