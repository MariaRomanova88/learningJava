package school.lesson8;

public class MainApp {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "1234567");
        phonebook.add("Петров", "2345678");
        phonebook.add("Петров", "3456789");
        phonebook.add("Сидоров", "4567891");
        phonebook.add("Сидоров", "5678910");
        phonebook.add("Сидоров", "6789101");

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
        phonebook.get("Романов");
    }
}
