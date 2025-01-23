package school.lesson4;

public class Run {
    public void run(Animal animal, int distance) {
        if (animal instanceof Dog) {
            if (distance <= 500) {
                System.out.println(animal.name + " ran " + distance + " m.");
            } else {
                System.out.println(animal.name + " cant run " + distance + " m.");
            }
        } else if (animal instanceof Cat) {
            if (distance <= 200) {
                System.out.println(animal.name + " ran " + distance + " m.");
            } else {
                System.out.println(animal.name + " cant run " + distance + " m.");
            }
        }
    }
}