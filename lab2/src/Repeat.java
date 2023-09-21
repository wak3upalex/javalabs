import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //указание того, что аннотация будет доступна во время выполнения программы
@Target(ElementType.METHOD)         //указываем то что аннотация будет применяться только к методам
public @interface Repeat {
    int value();                    //определяем целочисленный параметр для для аннотации
}
