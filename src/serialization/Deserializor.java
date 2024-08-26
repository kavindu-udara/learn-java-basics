package serialization;

import java.io.*;

public class Deserializor {

    // Notes : Deserialization is the process of converting a byte stream into an object.
    // The serialized form of an object can be reconstructed into an object of the same type.
    // This is the process of converting a byte stream into an object.

    // Deserialization is done by using the java.io.ObjectInputStream class.

    // Serialization is done by using the java.io.ObjectOutputStream class.

    // Deserialization is faster than serialization.

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        // Deserialization
        FileInputStream fileIn = new FileInputStream("D:\\java projects\\New folder (2)\\javaProjact\\UserInfo.ser");

        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();

        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

    }
}
