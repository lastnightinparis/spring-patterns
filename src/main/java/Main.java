import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.Quoter;
import quoters.TerminatorQuoter;

/**
 * @author Kir
 * Created on 11.01.2021
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //context.getBean(Quoter.class).sayQuote();
    }
}
