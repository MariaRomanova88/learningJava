package school.lesson4;

public class MainClass {

    public static void main(String[] args) {

        int catCount = 2;
        int dogCount = 2;
        int animalCount = 4;

        Cat cat1 = new Cat("Pushok");
        Cat cat2 = new Cat("Dymka");
        Dog dog1 = new Dog("Mukhtar");
        Dog dog2 = new Dog("Federika");

        cat1.run(200);
        cat2.swim(0);
        dog1.run(500);
        dog2.swim(10);

        System.out.println();

        while (catCount != 0) {
            System.out.println("There is/are " + catCount + " cat(-s).");
            catCount --;
        }

        while (dogCount != 0) {
            System.out.println("There is/are " + dogCount + " dog(-s).");
            dogCount --;
        }

        while (animalCount != 0) {
            System.out.println("There is/are " + animalCount + " animal(-s).");
            animalCount --;
        }

    }
}

