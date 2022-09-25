package school.lesson4;

public class MainClass {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Pushok");
        Cat cat2 = new Cat("Dymka");
        Dog dog1 = new Dog("Mukhtar");
        Dog dog2 = new Dog("Federika");

        cat1.run(200);
        cat2.swim(0);
        dog1.run(500);
        dog2.swim(10);

        System.out.println();

    }
}

