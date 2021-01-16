package quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Kir
 * Created on 16.01.2021
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
    Class<?> newImpl();

}
