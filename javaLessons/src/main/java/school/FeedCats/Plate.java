package school.FeedCats;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("Food amount: " + food);
    }
}
