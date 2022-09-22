package school.lesson1;

    //Task 1;
    public class HomeWorkApp {

        //Task 6: Tasks 2-5;
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        //Task 2;
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        //Task 3;
        public static void checkSumSign() { // Сумма положительная;
            int a = 6;
            int b = 9;

            if (a + b >= 0) {
                System.out.println ("Сумма положительная");
            } else {
                System.out.println ("Сумма отрицательная");
            }
        }

        //Task 4;
        public static void printColor() { //Жёлтый;
            int value = 100;

            if (value <= 0) {
                System.out.println ("Красный");
            } else if (value > 0  & value <= 100) {
                System.out.println ("Жёлтый");
            } else {
                System.out.println ("Зелёный");
            }
        }

        //Task 5;
        public static void compareNumbers() {// a >= b;
            int a = 100;
            int b = 55;

            if (a >= b) {
                System.out.println ("a >= b");
            } else {
                System.out.println ("a < b");

            }

        }
    }

