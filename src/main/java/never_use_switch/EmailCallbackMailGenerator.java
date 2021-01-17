package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Component("2")
public class EmailCallbackMailGenerator implements MailGenerator {

    @Override
    public String generate(MailInfo mailInfo) {
        return "mailInfo.getSth";
    }
}
