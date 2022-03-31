public class Employee {
    String firstName;
    String lastName;
    int age;
    double salary;
    //the location might be static or an enum (a set o places)
    String location;

    Employee(String firstName, String lastName, int age, double salary, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }
    void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}
