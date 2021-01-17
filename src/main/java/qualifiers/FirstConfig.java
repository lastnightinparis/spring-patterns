package qualifiers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Configuration
public class FirstConfig {

    @Bean
    @First
    public String s1() {
        return "First";
    }
    @Bean
    @First
    public String s2() {
        return "Second";
    }
    @Bean
    @First
    public String s3() {
        return "Third";
    }
}
