public class Analyst extends Employee {
    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        // We can use both "this." or "super." keywords to refer that this is a value of the superclass:
        return super.salary * .05;
    }

}
