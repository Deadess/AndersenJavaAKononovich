package school.lesson5;

class GetWeight<T extends Fruit> {
    public float getWeight(Box<? extends Fruit> box) {
        float totalWeight = 0.0f;
        for (Fruit fruit : box.getFruits()) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
}