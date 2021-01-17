package singltone_anti_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TaxCalculatorTest {

    @Test
    void withNds() {
        NdsResolver mock = Mockito.mock(NdsResolver.class);
        Mockito.when(mock.getNds()).thenReturn(0.2);
        double withNds = new TaxCalculator(mock).withNds(100);
        Assertions.assertEquals(120, withNds, 0.00001);
    }
}