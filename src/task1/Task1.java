package task1;

import java.io.*;

/**
 * @author Almat on 08.02.2020
 *
 * Task 1: implement Serializable
 */
public class Task1 {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User(1L, "Almat");
        Empty empty = new Empty();

        File file = new File("user.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User readObject = (User) objectInputStream.readObject();
        System.out.println(readObject);

        file = new File("empty.bin");
        fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(empty);

        fileOutputStream.close();
        objectOutputStream.close();
        fileInputStream.close();
        objectInputStream.close();

    }

}
