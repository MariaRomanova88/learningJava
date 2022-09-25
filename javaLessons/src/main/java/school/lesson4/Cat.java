package school.lesson4;

public class Cat extends Animal {
    private static int count;
    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Cat";
    }

    @Override
    public void swim(int y) {
        System.out.println("Cat can't swim!");
    }
        public static int getCount() {
            return count;
    }
}







