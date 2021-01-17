package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Service
public class MailSender {
    @Autowired
    private Map<String, MailGenerator> map = new HashMap<>();

    public void send(MailInfo mailInfo){
        String code = mailInfo.toString();
        MailGenerator mailGenerator = map.get(mailInfo.toString());
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(code);
        }
        String generate = mailGenerator.generate(mailInfo);
        sendMail(generate);
    }

    private void sendMail(String generate) {
        System.out.println("send");
    }
}
