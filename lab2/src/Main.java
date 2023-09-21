import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        AnnotatedMethods obj = new AnnotatedMethods(); //создаем объект класса AnnotatedMethods
        Method[] methods = AnnotatedMethods.class.getDeclaredMethods(); //получаем массив методов класса AnnotatedMethods

        for (Method method : methods) { //проходимся по всем методам класса AnnotatedMethods
            if (method.isAnnotationPresent(Repeat.class)) { //если метод помечен аннотацией Repeat
                int repeatCount = method.getAnnotation(Repeat.class).value(); //получаем значение аннотации Repeat
                method.setAccessible(true); //устанавливаем флаг доступа к методу
                for (int i = 0; i < repeatCount; i++) { //проходимся по циклу в соответствии с полученным значением аннотации
                    try {
                        method.invoke(obj); //вызываем метод
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}