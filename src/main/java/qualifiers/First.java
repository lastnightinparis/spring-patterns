package qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Kir
 * Created on 17.01.2021
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface First {
}
