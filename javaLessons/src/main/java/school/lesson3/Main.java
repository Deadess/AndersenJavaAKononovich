package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 45);
        employees[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "892312314", 50000, 50);
        employees[3] = new Employee("Smirnov Smirn", "Analyst", "smirnov@mailbox.com", "892312315", 35000, 28);
        employees[4] = new Employee("Kuznetsov Kuzma", "Designer", "kuznetsov@mailbox.com", "892312316", 45000, 42);
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}
