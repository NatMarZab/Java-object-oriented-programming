import java.sql.Timestamp;

public class MissedPaymentEvent implements Event {
    private final Long createdTimestamp;
    private final String id;

    public MissedPaymentEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimesStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment." + "Sending a bill to the customer.");

    }
}
