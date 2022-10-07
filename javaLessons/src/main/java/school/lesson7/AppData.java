package school.lesson7;

import java.io.*;
import java.util.ArrayList;
public class AppData {

    private final String[] header;
    private final int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public static AppData readFromCsv(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // читаем первую строку
            String headerLine = reader.readLine();

            // разбиваем строку по разделителю на заголовки
            String[] header = headerLine.split(";");

            // количество столбцов - это длина массива header
            int numberOfColumns = header.length;

            // создаем коллекцию, в которой будут содержаться значения строк и столбцов
            // используем коллекцию ArrayList, т.к. не можем использовать массив, потому что не знаем количество строк в файле
            ArrayList<int[]> list = new ArrayList<>();

            // пробегаем по строчкам файла, пока reader.readLine() не вернет null
            // когда вернется null - файл закончен
            String line = reader.readLine();
            while (line != null) {
                // рзбиваем строку по разделителю на значения
                String[] strValues = line.split(";");

                // создаем новый массив размером, равным количеству столбцов
                int[] values = new int[numberOfColumns];

                // в цикле преобразуем строковые значения в числовые и записываем в массив
                for (int i = 0; i < numberOfColumns; i++) {
                    values[i] = Integer.parseInt(strValues[i]);
                }

                // добавляем в коллекцию массив со значениями столбцов
                list.add(values);

                // читаем из файла следующую строку
                line = reader.readLine();
            }

            // Преобразуем наш ArrayList в массив
            int[][] data = new int[list.size()][numberOfColumns];
            list.toArray(data);

            // весь файл прочитан и теперь можем вернуть из метода объект AppData
            return new AppData(header, data);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveToCsv(String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, false), true)) {
            // делаем из массива строку разделенную ;
            String headerLine = String.join(";", header);

            // записывам всю строку в файл
            writer.println(headerLine);

            // в циклах пробегаем по всем числовым значениям из массива и записываем в файл
            for (int[] columns : this.data) {
                for (int value : columns) {
                    String valueAndSeparator = value + ";";
                    // Сохраняет в файл числовое значение и разделитель
                    writer.print(valueAndSeparator);
                }

                // все столбцы записаны, делаем перевод на новую строку
                writer.println();
            }
        }
    }
}
