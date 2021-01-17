package qualifiers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Service
public class FirstService {
    @Autowired
    @First
    @Getter
    private List<String> list;
}
