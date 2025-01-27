package school.lesson4;

public class Cat extends Animal {
    private static int count;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " ran " + distance + " m.");
        } else {
            System.out.println(name + " unable to run " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " cant swim.");
    }

    public boolean eat(Plate plate) {
        if (plate.getFood() >= 10) {
            plate.decreaseFood(10);
            this.isFull = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCount() {
        return count;
    }
}
