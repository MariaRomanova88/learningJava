package school.lesson6;

public class MainClass {
    public static void main(String[] args) {

        int result = 0;

        String[][] array = {{"1","1","1","1"},{"1","1","1","1"}};
        String[][] invalid_array = {{"1","2","3","4","1"},{"1","2","3","4"}};
        String[][] invalid_data = {{"1","1","3","4",},{"1","2","аа3","4"}};

        //Корректный массив;
        try {
            result = analyze(array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равен " + result);
        }

        //Некорректный массив;
        try {
            result = 0;
            result = analyze(invalid_array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равен " + result);
        }

        //Некорректные данные;
        try {
            result = 0;
            result = analyze(invalid_data);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равен " + result);
        }
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        int value;
        int row;
        int cell;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i = 1; i < 3; i++){
            row = i;
            for(int c = 1; c < 5; c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    sum += value;
                } catch (IllegalArgumentException e){
                    String message = "в/во " + row + " ряду в " + cell + " ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return sum;
    }
}