public class Main {
    public static void main(String[] args) {
        // create an instance
        BankAccount account1 = new BankAccount("Laura", 3000);

        account1.withDrawMoney(25);
        account1.depositMoney(40);
        account1.withDrawMoney(10);
        System.out.println(account1.getOwner());
        System.out.println(account1.getBalance());

    }
}
