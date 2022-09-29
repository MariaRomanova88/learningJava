package school.lesson5;
import java.util.ArrayList;

public class HomeworkMain {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();

        boxApple.addFruit(apple);
        boxApple.addFruit(apple);

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }
}

class Box<T> {
    private boolean isEmpty = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList;

    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            currentWeight++;
            if (arrayList.size() < 1)
                isEmpty = false;
        } else
            System.out.println("The box is full.");
    }

    float getWeight(Fruit F) {
        return arrayList.size() * F.weight;
    }

    boolean compare(Fruit F1, Fruit F2) {
        if (getWeight(F1) == getWeight(F2)) {
            return true;
        } else return false;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight) {
            return true;
        } else return false;
    }
}