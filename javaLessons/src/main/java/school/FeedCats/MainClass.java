package school.FeedCats;

public class MainClass {

    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Tom", 5, false);
        allCats[1] = new Cat("Matroskin", 20, false);
        allCats[2] = new Cat("Murzik", 10, false);
        allCats[3] = new Cat("Vasily", 15, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Cat " + allCats[i].name + " ate.");
            } else {
                System.out.println("Cat " + allCats[i].name + " didn't eat.");
            }
        }
        plate.info();
        System.out.println("Put food on the plate.");
    }
}