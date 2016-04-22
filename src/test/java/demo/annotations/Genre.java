package demo.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Qualifier
public @interface Genre {
    User user() default User.STUDENT;

    public enum User{STUDENT, TEACHER}
}
