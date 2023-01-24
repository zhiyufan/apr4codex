package com.codex;

import java.util.*;

public class Solution {
import java.io.*;

public class Program {
    public static void main(String[] arg) throws IOException {
        User user1 = new User("ivan", "Ivanov", "Ivanovich", 30);
        User user2 = new User("evgen", "Evgenev", "Evgenovich", 60);
        User user3 = new User("alex", "Alexeev", "Alexeevich", 40);

        File file = new File("file.txt");
        if (!file.exists()) file.createNewFile();
        file.deleteOnExit();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));

        objectOutputStream.writeObject(user1);
        objectOutputStream.writeObject(user2);
        objectOutputStream.writeObject(user3);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.txt"));
        try {
            while (true) {
                User tempUser = (User) objectInputStream.readObject();
                System.out.println(tempUser.getName() + " " + tempUser.getLastName() + " " + tempUser.getPatronymic() + " " + tempUser.getAge());
            }
        } catch (EOFException e) {
            System.out.println("End File");
        }
        objectInputStream.close();
        objectOutputStream.close();
    }

}
}