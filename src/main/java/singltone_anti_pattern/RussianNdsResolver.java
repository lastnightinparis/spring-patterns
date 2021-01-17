package singltone_anti_pattern;

import lombok.SneakyThrows;

/**
 * @author Kir
 * Created on 17.01.2021
 */

public class RussianNdsResolver implements NdsResolver {
    private double nds;

    public RussianNdsResolver() {
        nds = getNdsFromSth();
    }
    @SneakyThrows
    private double getNdsFromSth() {
        Thread.sleep(1000);
        return 0.2;
    }

    @Override
    public double getNds() {
        return nds;
    }
}
