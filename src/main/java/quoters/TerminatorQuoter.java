package quoters;

import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

/**
 * @author Kir
 * Created on 11.01.2021
 */

@Profiling
public class TerminatorQuoter implements Quoter {
    @InjectRandom(min = 2, max = 5)
    private int repeat;

    private String message;

    @PostConstruct
    public void init(){
        System.out.println("Phase: 2");
    }

    public TerminatorQuoter() {
        System.out.println("Phase: 1");
    }

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
