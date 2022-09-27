package school.lesson4;

public abstract class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;

    public Animal () {
    }
    public Animal (String name) {
        this.name = name;
    }

    public Animal(String name, String type, int maxRun, int maxSwim) {
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int x) {
        if (this.maxRun >= x)
            System.out.println(type + " " + name + " " + " ran " + x + " m.");
        else
            System.out.println("name: " + name + ", type: " + type + " is tired..");
    }

    public void swim(int y) {
        if (this.maxRun >= y)
            System.out.println(type + " " + name + " " + " swam " + y + " m.");
        else
            System.out.println("name: " + name + ", type: " + type + " is tired..");
    }

    public void info() {
        System.out.println("name: " + name + ", type: " + type + ", run: " + maxRun + ", swim: " + maxSwim);
    }
}




