package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator{
    @Override
    public String generate(MailInfo mailInfo) {
        // business
        return "mailInfo.getSth";
    }
}
