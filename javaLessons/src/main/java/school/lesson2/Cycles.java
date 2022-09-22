package school.lesson2;

public class Cycles {
    public static void main(String[] args) {

        System.out.println(within10and20(9, 6));//Task 1;
        isPositiveOrNegative(12);//Task 2;
        System.out.println(isNegative(15));//Task 3;
        printWordNTimes("String", 5);//Task 4;
        System.out.println(leapYear(1900));//Task *;

    }
    //Task 1;
    public static boolean within10and20(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    //Task 2;
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Numeral " + x + " is positive");
        } else {
            System.out.println("Numeral " + x + " is negative");
        }
    }

    //Task 3;
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Task 4;
    public static void printWordNTimes(String str, int n) {
        for (int i = 1; i<=n; i++) {
            System.out.println("["+ i +"]" + " " + str);
        }
    }

    //Task *;

    public static boolean leapYear(int year) {
        return year % 4 == 0 && ((year % 100 != 0) || year % 400 == 0);
        }
    }

