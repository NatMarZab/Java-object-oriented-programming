public class Salesperson extends Employee {
    private double commissionPercentage;
    public Salesperson(String name, double salary, int age, double comissionPercentage) {

        // Access the superclass constructor using "super" keyword:
        super(name, salary, age);
        this.commissionPercentage = comissionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission() {
        if(this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}
