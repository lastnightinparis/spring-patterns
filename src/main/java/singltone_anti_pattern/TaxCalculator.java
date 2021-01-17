package singltone_anti_pattern;

import lombok.AllArgsConstructor;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@AllArgsConstructor
public class TaxCalculator {
    private NdsResolver ndsResolver;

    public double withNds(double price){
         return ndsResolver.getNds() * price + price;
    }
}
