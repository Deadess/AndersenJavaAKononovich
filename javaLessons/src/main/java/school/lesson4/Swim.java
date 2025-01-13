package school.lesson4;

public class Swim {
    public void swim(Animal animal, int distance) {
        if (animal instanceof Dog) {
            if (distance <= 10) {
                System.out.println(animal.name + " проплыл " + distance + " м.");
            } else {
                System.out.println(animal.name + " не может проплыть " + distance + " м.");
            }
        } else if (animal instanceof Cat) {
            System.out.println(animal.name + " не умеет плавать.");
        }
    }
}