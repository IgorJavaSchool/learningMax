package lesson1.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * Created by MM on 24.11.2017.
 */
public class UserReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Users.data"));
        System.out.println((User) inputStream.readObject());
        System.out.println((User) inputStream.readObject());
        System.out.println((Date) inputStream.readObject());
        inputStream.close();
    }
}
