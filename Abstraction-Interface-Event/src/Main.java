public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("234567891234");
        AccountTransferEvent eventTwo = new AccountTransferEvent("12345668747586");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("234556847665");

        // Since they all are events, we can put them together in an array:
        Event[] events = {eventOne, eventTwo, eventThree};

        //We can iterate the array and process each individually:
        for (Event e : events) {
            System.out.println(e.getTimesStamp());
            e.process();
            System.out.println();
        }
    }
}
