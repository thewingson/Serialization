package task1;

import java.io.Serializable;

/**
 * @author Almat on 08.02.2020
 */
public class User implements Serializable {

    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
