public class BankAccount {
    private String owner;
    private double balance;
    //Constructor
    public BankAccount(String owner, int startingBalance) {
        this.owner = owner;
        //using Math.max forces the balance to be set as a positive number
        this.balance = Math.max(startingBalance, 0);
    }

    //Withdraw and deposit methods
    public double withDrawMoney(double amountMoney) {
        if(amountMoney <= this.balance) {
            this.balance = this.balance - amountMoney;
            return amountMoney;
        }
        return 0;

    }
    // As setter:
    public double depositMoney(double amountMoney) {
        if(amountMoney > 0) {
            this.balance = this.balance + amountMoney;
        }
        return 0;
    }

    //Getter methods
    public double getBalance() {
        return this.balance;
    }
    public String getOwner() {
        return this.owner;
    }


}
