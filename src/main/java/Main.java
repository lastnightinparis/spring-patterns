import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.TerminatorQuoter;

/**
 * @author Kir
 * Created on 11.01.2021
 */

public class Main {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("context.xml");
       context.getBean(TerminatorQuoter.class).sayQuote();
    }
}
