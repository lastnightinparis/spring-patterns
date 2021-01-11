package quoters;

/**
 * @author Kir
 * Created on 11.01.2021
 */

public class TerminatorQuoter implements Quoter {
    @InjectRandom(min = 2, max = 5)
    private int repeat;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);;
        }
    }
}
