import java.sql.Timestamp;

public class PasswordChangeEvent extends AbstractEvent {

    public PasswordChangeEvent(String id) {
        //Here, we call the AbstractEvent´s constructor
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password." + "Sending a confirmation email to the customer.");
    }
}
