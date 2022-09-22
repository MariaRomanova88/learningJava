package school.lesson2;

public class Arrays {
    public static void main(String[] args) {
        int[] arr5 = {1, 0, 1, 0, 0, 1};//Task 5;
        int[] arr6 = new int[100];//Task 6;
        int[] arr7 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//Task 7;
        System.out.println("Task 5: ");
        invertArray(arr5);
        System.out.println("Task 6: ");
        fillArray(arr6);
        System.out.println("Task 7: ");
        changeArr(arr7);
        System.out.println("Task 8: ");
        fillDiagonal();
    }

    //Task 5;
    public static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");

        }
        return arr;
    }

    //Task 6;
    public static void fillArray(int[] arr) {
        //int[] arr = new int[100];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        //System.out.print(arr[i] + " ");
    }

    //Task 7;
    public static void changeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    //Task 8;
    public static void fillDiagonal() {
            int[][] arr = new int[4][4];
            for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                 if (i == j) {

                 arr[i][j] = 1;
                 }
                 System.out.println(arr[i] + " ");
            }

        }
    }
}

