package school.lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        this.maxRun = 500;
        this.maxSwim = 10;
        this.type = "Dog";
    }

    public static int getCount() {
        return count;
    }
}
