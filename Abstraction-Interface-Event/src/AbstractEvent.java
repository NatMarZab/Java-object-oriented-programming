import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {
    protected Long createdTimestamp;
    protected String id;

    public AbstractEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimesStamp() {
        return this.createdTimestamp;
    }

    public abstract void process();
}
