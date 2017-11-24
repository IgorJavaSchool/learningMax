package lesson1.task4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by MM on 24.11.2017.
 */
public class UserWriter {
    public static void main(String[] args) throws IOException {
        User user1 = new User("Jon", 23, 1500l);
        User user2 = new User("Kevin", 35, 3500l);
        Date date = new Date();
        System.out.println(date);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.data"));
        outputStream.writeObject(user1);
        outputStream.writeObject(user2);
        outputStream.writeObject(date);
        outputStream.flush();
        outputStream.close();
    }
}
