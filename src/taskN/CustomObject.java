package taskN;

/**
 * @author Almat on 08.02.2020
 */
public class CustomObject {

    private transient boolean b;

    @Override
    public String toString() {
        return "CustomObject{" +
                "b=" + b +
                '}';
    }
}
