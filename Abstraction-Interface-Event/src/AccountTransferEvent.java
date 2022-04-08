import java.sql.Timestamp;

public class AccountTransferEvent implements Event {
    private final Long createdTimestamp;
    private final String id;

    public AccountTransferEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimesStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer" + "their servoce. Reaching out to CTE to remove " + "service form old device and add service to " + "new device");

    }

}
