package school.lesson4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dodo");
        Cat cat1 = new Cat("Mimi");

        dog1.run(150);
        cat1.run(300);
        dog1.swim(5);
        cat1.swim(2);

        System.out.println("Dogs created: " + Dog.getCount());
        System.out.println("Cats created: " + Cat.getCount());
        System.out.println("Animals created: " + Animal.getAnimalCount());

        // Работа с едой
        Cat[] cats = {new Cat("Mimi"), new Cat("Мeme"), new Cat("Momo")};
        Plate plate = new Plate(20);

        for(Cat cat : cats) {
            if(cat.eat(plate)) {
                System.out.println(cat.name + " have eaten.");
            } else {
                System.out.println(cat.name + " couldnt eat.");
            }
        }

        for(Cat cat : cats) {
            System.out.println(cat.name + " satiety: " + cat.isFull());
        }
    }
}
