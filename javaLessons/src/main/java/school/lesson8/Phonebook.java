package school.lesson8;

import java.util.*;

public class Phonebook {

    private final HashMap<String, List<String>> phonebook;

    public Phonebook(){
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String number){
        if(phonebook.containsKey(surname)){
            List<String> numbers = phonebook.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
            } else {
                System.out.printf("Номер %s уже существует для фамилии %s%n", number, surname);
            }
        } else {
            phonebook.put(surname, new ArrayList<>(Collections.singletonList(number)));
            System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
        }
    }

    public void get(String surname){
        if(phonebook.containsKey(surname)){
            phonebook.get(surname);
        } else {
            System.out.printf("В справочнике нет записи для фамилии %s%n", surname);
        }
    }
}