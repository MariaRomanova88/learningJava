package school.lesson3;

         //Task 1;
public class Employee {

        //Task 4;
    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Romanova Maria", "QA", "4851267890", "romanova@gmail.com", 4.300, 34);
        emp[1] = new Employee("Kudrautsau Aliaksey", "Developer", "5363421809", "kudrautsau@gmail.com", 6.000, 36);
        emp[2] = new Employee("Semyonov Vitaly", "Manager", "7095649110", "semyonov@gmail.com", 7.700, 44);
        emp[3] = new Employee("John Smith", "BA", "8954345707", "smith@gmail.com", 5.900, 41);
        emp[4] = new Employee("Cavin Morris", "HR", "3368076128", "morris@gmail.com", 3.500, 29);

        //Task 5;
        for (Employee employee : emp)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
    public int getAge() {
        return age;
    }

       //Task 1-3;
    private String fullName;
    private String position;
    private String phoneNumber;
    private String email;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String phoneNumber, String email, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void info () {
            {
                System.out.println("Меня зовут " + fullName + ", должность: " + position + ", номер телефона: " + phoneNumber + ", email " + email + ", зарплата: " + salary + ", возраст: " + age);
            }
        }
    }


    