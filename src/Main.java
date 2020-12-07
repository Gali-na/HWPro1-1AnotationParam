import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> textClass = PrintText.class;
        Method[] methods = textClass.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            if (methods[i].isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = methods[i].getAnnotation(MyAnnotation.class);
                try {
                    methods[i].invoke(null, myAnnotation.paramOne(), myAnnotation.paramTwo());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
