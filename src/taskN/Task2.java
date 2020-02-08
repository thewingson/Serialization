package taskN;

import java.io.*;

/**
 * @author Almat on 08.02.2020
 */
public class Task2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DataObject dataObject = new DataObject();
        dataObject.setMyData("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        File file = new File("data.bin");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(dataObject);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        DataObject dataObject1 = (DataObject) objectInputStream.readObject();
        System.out.println(dataObject1);
        objectInputStream.close();
        fileInputStream.close();

    }

}
