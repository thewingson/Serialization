package task2;

import task1.User;

import java.io.*;

/**
 * @author Almat on 08.02.2020
 *
 * Task2:
 *      Deep serialization on {@link Car}
 *      serialver utility on {@link SerialiseMe}
 *
 */
public class Task2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car = new Car("Toyota", new Engine(123L, Short.valueOf("400")));

        File file = new File("toyota.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(car);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car readObject = (Car) objectInputStream.readObject();
        System.out.println(readObject);

    }

}
