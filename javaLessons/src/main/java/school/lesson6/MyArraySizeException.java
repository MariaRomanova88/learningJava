package school.lesson6;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива некорректный.");
    }
}