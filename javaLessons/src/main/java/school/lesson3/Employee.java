package school.lesson3;

class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Name: " + fullName + ", Position: " + position + ", Email: " + email +
                ", Phone: " + phone + ", Salary: " + salary + ", Age: " + age);
    }
}

