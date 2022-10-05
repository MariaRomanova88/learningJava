package school.lesson7;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        // путь к файлу, нужно вписать свой путь, например String folder = "d:/my_folder/"
        String folder = "d:/my_folder/";

        // читаем файл input.csv, который находится в папке folder
        var appData = AppData.readFromCsv(folder + "input.csv");

        // записываем в файл output.csv, который находится в папке folder
        appData.saveToCsv(folder + "output.csv");
    }
}