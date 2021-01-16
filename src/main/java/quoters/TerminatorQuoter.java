package quoters;

import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

/**
 * @author Kir
 * Created on 11.01.2021
 */

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {
    @InjectRandom(min = 2, max = 5)
    private int repeat;

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

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
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase: 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);;
        }
    }
}
