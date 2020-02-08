package taskN;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Almat on 08.02.2020
 */
public class DataObject extends NonSerializable implements Serializable {

    private int i;
    private String s;
    private transient String[] strings;
    private CustomObject customObject;

    @Override
    public String toString() {

        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", strings=" + Arrays.toString(strings) +
                ", customObject=" + customObject +
                '}' +
                "\n" + super.toString();
    }
}
