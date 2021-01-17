package qualifiers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Service
public class SecondsService {

    @Autowired
    @Getter
    @Second
    public List<String> list;
}
