package qualifiers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kir
 * Created on 17.01.2021
 */

public class Q {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext qualifiers = new AnnotationConfigApplicationContext("qualifiers");
        System.out.println("First Service list: \n" + qualifiers.getBean(FirstService.class).getList());
        System.out.println("Second Service list: \n" + qualifiers.getBean(SecondsService.class).getList());
    }
}
