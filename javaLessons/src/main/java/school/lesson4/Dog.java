package school.lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if(distance <= 500) {
            System.out.println(name + " ran " + distance + " m.");
        } else {
            System.out.println(name + " cant run " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance <= 10) {
            System.out.println(name + " swam " + distance + " m.");
        } else {
            System.out.println(name + " cant swim " + distance + " m.");
        }
    }

    public static int getCount() {
        return count;
    }
}
