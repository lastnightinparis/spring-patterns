package qualifiers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Kir
 * Created on 17.01.2021
 */
@Configuration
public class SecondConfig {
    @Bean
    @Second
    public List<String> messages() {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("First");
        strs.add("Second");
        return strs;
    }
}
