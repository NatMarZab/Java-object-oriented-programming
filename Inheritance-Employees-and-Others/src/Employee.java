public class Employee extends Person {

    //In order to be accesible by getAnnualBonus() (Analyst.java), will change it from private to protected:
    protected double salary;

    public Employee(String name, double salary, int age){
        super(name, age);
        this.salary = salary;

    }
    public double getSalary() {
        return this.salary;
    }
    public void raiseSalary() {
        this.salary = this.salary + 1.2;
    }
}
