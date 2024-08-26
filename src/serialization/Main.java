package serialization;

import java.io.*;

// steps to serialize
// 1. import java.io.Serializable
// 2. create a class that implements Serializable
// 3. create a constructor with no arguments

public class Main {
    public static void main(String[] args) throws IOException {
        // serialization = converting an object into a byte stream.
        // deserialization = converting a byte stream into an object.

        // Serialization is the process of converting an object into a byte stream.
        // The resulting byte stream can be stored in a file, transmitted over a
        // network,
        // or used in other ways. The serialized form of an object can be reconstructed
        // into an object of the same type. This is the process of converting a byte
        // stream
        // into an object.

        User user = new User();
        user.name = "Bro123";
        user.password = "password123";

        // serialization
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in UserInfo.ser");

    }
}
